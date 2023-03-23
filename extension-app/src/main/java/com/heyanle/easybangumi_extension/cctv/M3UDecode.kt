package com.heyanle.easybangumi_extension.cctv

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File

/**
 * Created by LoliBall on 2023/3/1 7:52.
 * https://github.com/WhichWho
 */
object M3UDecode {

    suspend fun decode(m3u: String) = withContext(Dispatchers.IO) {
        buildList<M3U8> {
            var m3u8: M3U8? = null
            m3u.split("\n").forEach {
                if (it.isBlank()) return@forEach
                val line = it.trim()
                if (line.startsWith("#EXTINF")) {
                    m3u8 = decodeHeader(line)
                    return@forEach
                }
                if (m3u8 != null) {
                    this += m3u8!!.copy(url = line)
                    m3u8 = null
                }
            }
        }
    }

    private val headerReg =
        "#EXTINF:-1 tvg-id=\"(\\d*?)\" tvg-name=\"(.*?)\" tvg-logo=\"(.*?)\" group-title=\"(.*?)\",(.*)".toRegex()

    private fun decodeHeader(it: String): M3U8? {
        val list = headerReg.matchEntire(it)?.groupValues ?: return null
        return M3U8(
            id = list[1],
            name0 = list[2],
            logo = list[3],
            group = list[4],
            name = list[5],
            url = ""
        )
    }

}

data class M3U8(
    val id: String,
    val name0: String,
    val logo: String,
    val group: String,
    val name: String,
    val url: String
)