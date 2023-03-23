package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.SourceResult
import com.heyanle.bangumi_source_api.api.component.ComponentWrapper
import com.heyanle.bangumi_source_api.api.component.detailed.DetailedComponent
import com.heyanle.bangumi_source_api.api.component.update.UpdateComponent
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
            cartoon(summary) to playLines()
        }
    }

    override suspend fun getDetailed(summary: CartoonSummary): SourceResult<Cartoon> {
        return withResult { cartoon(summary) }
    }

    override suspend fun getPlayLine(summary: CartoonSummary): SourceResult<List<PlayLine>> {
        return withResult { playLines() }
    }

    private fun cartoon(summary: CartoonSummary) =
        CartoonImpl(
            id = summary.id,
            source = summary.source,
            url = summary.url,
            title = "title",
        )

    private fun playLines() = listOf(PlayLine("", "", arrayListOf()))

}
