package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.SourceResult
import com.heyanle.bangumi_source_api.api.component.ComponentWrapper
import com.heyanle.bangumi_source_api.api.component.play.PlayComponent
import com.heyanle.bangumi_source_api.api.entity.CartoonSummary
import com.heyanle.bangumi_source_api.api.entity.PlayLine
import com.heyanle.bangumi_source_api.api.entity.PlayerInfo
import com.heyanle.bangumi_source_api.api.entity.PlayerInfo.Companion.DECODE_TYPE_DASH
import com.heyanle.bangumi_source_api.api.entity.PlayerInfo.Companion.DECODE_TYPE_HLS
import com.heyanle.bangumi_source_api.api.withResult

class CCTVPlayComponent(source: Source) : ComponentWrapper(source), PlayComponent {

    override suspend fun getPlayInfo(
        summary: CartoonSummary,
        playLine: PlayLine,
        episodeIndex: Int
    ): SourceResult<PlayerInfo> {
        return withResult { PlayerInfo(PlayerInfo.DECODE_TYPE_DASH, uri = summary.url) }
    }

}
