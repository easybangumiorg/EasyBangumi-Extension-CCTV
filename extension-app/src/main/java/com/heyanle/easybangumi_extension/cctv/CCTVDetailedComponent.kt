package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.SourceResult
import com.heyanle.bangumi_source_api.api.component.ComponentWrapper
import com.heyanle.bangumi_source_api.api.component.detailed.DetailedComponent
import com.heyanle.bangumi_source_api.api.entity.Cartoon
import com.heyanle.bangumi_source_api.api.entity.CartoonImpl
import com.heyanle.bangumi_source_api.api.entity.CartoonSummary
import com.heyanle.bangumi_source_api.api.entity.PlayLine
import com.heyanle.bangumi_source_api.api.withResult
import kotlinx.coroutines.Dispatchers

class CCTVDetailedComponent(source: Source) :
    ComponentWrapper(source),
    DetailedComponent {

    override suspend fun getAll(summary: CartoonSummary): SourceResult<Pair<Cartoon, List<PlayLine>>> {
        return withResult(Dispatchers.IO) {
            cartoon(summary) to playLines(summary)
        }
    }

    override suspend fun getDetailed(summary: CartoonSummary): SourceResult<Cartoon> {
        return withResult { cartoon(summary) }
    }

    override suspend fun getPlayLine(summary: CartoonSummary): SourceResult<List<PlayLine>> {
        return withResult { playLines(summary) }
    }

    private suspend fun cartoon(summary: CartoonSummary): CartoonImpl {
        initCCTVIfEmpty()
        val m3U8 = cctvSource.find { it.url == summary.id }
        return CartoonImpl(
            id = summary.id,
            source = summary.source,
            url = summary.url,
            title = m3U8?.name.orEmpty(),
            coverUrl = m3U8?.logo
        )
    }

    private fun playLines(summary: CartoonSummary) =
        listOf(PlayLine(summary.id, "线路1", arrayListOf("移动")))

}
