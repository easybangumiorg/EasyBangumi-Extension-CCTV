package com.heyanle.easybangumi_extension

import com.heyanle.bangumi_source_api.api.Source
import com.heyanle.bangumi_source_api.api.SourceFactory
import com.heyanle.easybangumi_extension.cctv.CCTVSource

/**
 * Created by HeYanLe on 2023/2/19 23:23.
 * https://github.com/heyanLE
 */
class EasySourceFactory2 : SourceFactory {

    override fun create() = listOf(CCTVSource())

}