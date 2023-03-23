package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.component.ComponentWrapper
import com.heyanle.bangumi_source_api.api.component.page.PageComponent
import com.heyanle.bangumi_source_api.api.component.page.SourcePage
import com.heyanle.bangumi_source_api.api.withResult
import kotlinx.coroutines.Dispatchers

/**
 * Created by LoliBall on 2023/3/23 23:30.
 * https://github.com/WhichWho
 */
class CCTVPageComponent(source: Source) : ComponentWrapper(source), PageComponent {

    override fun getPages(): List<SourcePage> {
        return listOf(
            SourcePage.SingleCartoonPage.WithCover(
                label = "label",
                firstKey = { 0 },
            ) {
                CCTVSearchComponent(source).search(0, "")
            }
        )
    }

}