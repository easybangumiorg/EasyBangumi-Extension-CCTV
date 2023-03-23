package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.SourceResult
import com.heyanle.bangumi_source_api.api.component.ComponentWrapper
import com.heyanle.bangumi_source_api.api.component.search.SearchComponent
import com.heyanle.bangumi_source_api.api.entity.CartoonCover
import com.heyanle.bangumi_source_api.api.entity.CartoonCoverImpl
import com.heyanle.bangumi_source_api.api.withResult
import kotlinx.coroutines.Dispatchers

/**
 * Created by LoliBall on 2023/3/23 23:04.
 * https://github.com/WhichWho
 */
class CCTVSearchComponent(source: Source) : ComponentWrapper(source), SearchComponent {

    override fun getFirstSearchKey(keyword: String) = 0

    override suspend fun search(
        pageKey: Int,
        keyword: String
    ): SourceResult<Pair<Int?, List<CartoonCover>>> {
        return withResult(Dispatchers.IO) {
            initCCTVIfEmpty()
            val result = cctvSource.filter { it.name.contains(keyword, true) }
                .map {
                    CartoonCoverImpl(
                        id = it.id,
                        source = it.url,
                        url = it.url,
                        title = it.name,
                        intro = it.name0,
                        coverUrl = it.logo
                    )
                }
            return@withResult null to result
        }
    }

}