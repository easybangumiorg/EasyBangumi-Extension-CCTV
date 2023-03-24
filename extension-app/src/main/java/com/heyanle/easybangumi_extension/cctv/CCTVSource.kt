package com.heyanle.easybangumi_extension.cctv

import com.heyanle.bangumi_source_api.api.component.Component
import com.heyanle.extension_api.ExtensionIconSource
import com.heyanle.extension_api.ExtensionSource

/**
 * Created by LoliBall on 2023/3/23 22:30.
 * https://github.com/WhichWho
 */
class CCTVSource : ExtensionSource(), ExtensionIconSource {

    override val describe: String? = "CCTV"
    override val label: String = "CCTV"
    override val sourceKey: String = "CCTV"
    override val version: String = "1.0.0"
    override val versionCode: Int = 1

    override fun getIconResourcesId() = R.drawable.cctv

    override fun components(): List<Component> {
        return listOf(
            CCTVSearchComponent(this),
            CCTVPageComponent(this),
            CCTVDetailedComponent(this),
            CCTVPlayComponent(this)
        )
    }

}