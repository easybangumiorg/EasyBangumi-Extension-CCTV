package com.heyanle.easybangumi_extension.cctv

/**
 * Created by LoliBall on 2023/3/23 23:12.
 * https://github.com/WhichWho
 */

var cctvSource: List<M3U8> = emptyList()

suspend fun initCCTVIfEmpty() {
    if (!cctvSource.isEmpty()) return
    cctvSource = M3UDecode.decode(cctvM3u).distinctBy { it.url }
}

val cctvM3u = """
#EXTM3U


#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV-HD",CCTV-1 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225804/index.m3u8
#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV-HD",CCTV-1 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226231/index.m3u8
#EXTINF:-1 tvg-id="2" tvg-name="CCTV2" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV2.png" group-title="CCTV-HD",CCTV-2 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226195/index.m3u8
#EXTINF:-1 tvg-id="2" tvg-name="CCTV2" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV2.png" group-title="CCTV-HD",CCTV-2 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226224/index.m3u8
#EXTINF:-1 tvg-id="3" tvg-name="CCTV3" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV3.png" group-title="CCTV-HD",CCTV-3 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226397/index.m3u8
#EXTINF:-1 tvg-id="3" tvg-name="CCTV3" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV3.png" group-title="CCTV-HD",CCTV-3 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226009/index.m3u8
#EXTINF:-1 tvg-id="4" tvg-name="CCTV4" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV4.png" group-title="CCTV-HD",CCTV-4 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226191/index.m3u8
#EXTINF:-1 tvg-id="4" tvg-name="CCTV4" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV4.png" group-title="CCTV-HD",CCTV-4 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226223/index.m3u8
#EXTINF:-1 tvg-id="5" tvg-name="cctv5" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5.png" group-title="CCTV-HD",CCTV-5 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226395/index.m3u8
#EXTINF:-1 tvg-id="6" tvg-name="CCTV5+" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5+.png" group-title="CCTV-HD",CCTV-5+ HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225761/index.m3u8
#EXTINF:-1 tvg-id="6" tvg-name="CCTV5+" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5+.png" group-title="CCTV-HD",CCTV-5+ HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226221/index.m3u8
#EXTINF:-1 tvg-id="7" tvg-name="CCTV6" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV6.png" group-title="CCTV-HD",CCTV-6 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226393/index.m3u8
#EXTINF:-1 tvg-id="7" tvg-name="CCTV6" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV6.png" group-title="CCTV-HD",CCTV-6 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226011/index.m3u8
#EXTINF:-1 tvg-id="8" tvg-name="CCTV7" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV7.png" group-title="CCTV-HD",CCTV-7 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226391/index.m3u8
#EXTINF:-1 tvg-id="8" tvg-name="CCTV7" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV7.png" group-title="CCTV-HD",CCTV-7 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226012/index.m3u8
#EXTINF:-1 tvg-id="9" tvg-name="CCTV8" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV8.png" group-title="CCTV-HD",CCTV-8 HD（无声）
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226391/index.m3u8
#EXTINF:-1 tvg-id="9" tvg-name="CCTV8" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV8.png" group-title="CCTV-HD",CCTV-8 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226012/index.m3u8
#EXTINF:-1 tvg-id="10" tvg-name="CCTV9" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV9.png" group-title="CCTV-HD",CCTV-9 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226197/index.m3u8
#EXTINF:-1 tvg-id="11" tvg-name="CCTV10" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV10.png" group-title="CCTV-HD",CCTV-10 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226189/index.m3u8
#EXTINF:-1 tvg-id="13" tvg-name="CCTV12" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV12.png" group-title="CCTV-HD",CCTV-12 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226190/index.m3u8
#EXTINF:-1 tvg-id="15" tvg-name="CCTV14" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV14.png" group-title="CCTV-HD",CCTV-14 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226193/index.m3u8
#EXTINF:-1 tvg-id="17" tvg-name="CCTV17" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV17.png" group-title="CCTV-HD",CCTV-17 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226198/index.m3u8

#EXTINF:-1 tvg-id="30" tvg-name="北京卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/beijing.png" group-title="LocalTVHD",北京卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225796/index.m3u8
#EXTINF:-1 tvg-id="30" tvg-name="北京卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/beijing.png" group-title="LocalTVHD",北京卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226222/index.m3u8
#EXTINF:-1 tvg-id="27" tvg-name="湖南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hunan.png" group-title="LocalTVHD",湖南卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225799/index.m3u8
#EXTINF:-1 tvg-id="27" tvg-name="湖南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hunan.png" group-title="LocalTVHD",湖南卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226211/index.m3u8
#EXTINF:-1 tvg-id="226" tvg-name="湖南金鹰纪实" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jinyingjishi.png" group-title="LocalTVHD",湖南金鹰纪实
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226351/index.m3u8
#EXTINF:-1 tvg-id="29" tvg-name="江苏卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jiangsu.png" group-title="LocalTVHD",江苏卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225800/index.m3u8
#EXTINF:-1 tvg-id="29" tvg-name="江苏卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jiangsu.png" group-title="LocalTVHD",江苏卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226200/index.m3u8
#EXTINF:-1 tvg-id="28" tvg-name="浙江卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/zhejiang.png" group-title="LocalTVHD",浙江卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225798/index.m3u8
#EXTINF:-1 tvg-id="28" tvg-name="浙江卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/zhejiang.png" group-title="LocalTVHD",浙江卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226199/index.m3u8
#EXTINF:-1 tvg-id="31" tvg-name="东方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongfang.png" group-title="LocalTVHD",东方卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226261/index.m3u8
#EXTINF:-1 tvg-id="31" tvg-name="东方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongfang.png" group-title="LocalTVHD",东方卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226217/index.m3u8
#EXTINF:-1 tvg-id="31" tvg-name="东方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongfang.png" group-title="LocalTVHD",东方卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225797/index.m3u8
#EXTINF:-1 tvg-id="32" tvg-name="安徽卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/anhui.png" group-title="LocalTVHD",安徽卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226196/index.m3u8
#EXTINF:-1 tvg-id="32" tvg-name="安徽卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/anhui.png" group-title="LocalTVHD",安徽卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226203/index.m3u8
#EXTINF:-1 tvg-id="46" tvg-name="黑龙江卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/heilongjiang.png" group-title="LocalTVHD",黑龙江卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225802/index.m3u8
#EXTINF:-1 tvg-id="46" tvg-name="黑龙江卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/heilongjiang.png" group-title="LocalTVHD",黑龙江卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226215/index.m3u8
#EXTINF:-1 tvg-id="36" tvg-name="辽宁卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/liaoning.png" group-title="LocalTVHD",辽宁卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226201/index.m3u8
#EXTINF:-1 tvg-id="36" tvg-name="辽宁卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/liaoning.png" group-title="LocalTVHD",辽宁卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226210/index.m3u8
#EXTINF:-1 tvg-id="34" tvg-name="深圳卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shenzhen.png" group-title="LocalTVHD",深圳卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225801/index.m3u8
#EXTINF:-1 tvg-id="34" tvg-name="深圳卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shenzhen.png" group-title="LocalTVHD",深圳卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226205/index.m3u8
#EXTINF:-1 tvg-id="33" tvg-name="广东卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/guangdong.png" group-title="LocalTVHD",广东卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225803/index.m3u8
#EXTINF:-1 tvg-id="33" tvg-name="广东卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/guangdong.png" group-title="LocalTVHD",广东卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226216/index.m3u8
#EXTINF:-1 tvg-id="39" tvg-name="天津卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/tianjin.png" group-title="LocalTVHD",天津卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226204/index.m3u8
#EXTINF:-1 tvg-id="48" tvg-name="湖北卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hubei.png" group-title="LocalTVHD",湖北卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226194/index.m3u8
#EXTINF:-1 tvg-id="48" tvg-name="湖北卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hubei.png" group-title="LocalTVHD",湖北卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226206/index.m3u8
#EXTINF:-1 tvg-id="38" tvg-name="山东卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shandong.png" group-title="LocalTVHD",山东卫视 HD
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226209/index.m3u8
#EXTINF:-1 tvg-id="40" tvg-name="重庆卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/chongqing.png" group-title="LocalTVHD",重庆卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226202/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",熊猫频道
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226349/index.m3u8
#EXTINF:-1 tvg-id="164" tvg-name="上海纪实" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanghaijishi.png" group-title="LocalTVHD",上海纪实人文
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226230/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",北京冬奥纪实
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226232/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",SiTV全纪实
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226580/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",SiTV极速汽车
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226574/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",SiTV极速汽车
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226583/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",SiTV游戏风云
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226579/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",SiTV都市剧场
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226581/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",体育赛事
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226803/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",精彩体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226010/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTVHD",圆点生活
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226552/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",爱上4K
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226352/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",SiTV欢笑剧场4K
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226582/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",CHC动作电影
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226465/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",CHC家庭影院
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226462/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",CHC高清电影
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226463/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",信号测试1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226337/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",信号测试2
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226338/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="localTVHD",IPTV5+
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226345/index.m3u8

#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV",CCTV-1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225783/index.m3u8
#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV",CCTV-1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225660/index.m3u8
#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV",CCTV-1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225965/index.m3u8
#EXTINF:-1 tvg-id="1" tvg-name="CCTV1" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV1.png" group-title="CCTV",CCTV-1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225846/index.m3u8
#EXTINF:-1 tvg-id="2" tvg-name="CCTV2" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV2.png" group-title="CCTV",CCTV-2
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225762/index.m3u8
#EXTINF:-1 tvg-id="3" tvg-name="CCTV3" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV3.png" group-title="CCTV",CCTV-3
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225782/index.m3u8
#EXTINF:-1 tvg-id="3" tvg-name="CCTV3" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV3.png" group-title="CCTV",CCTV-3
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226398/index.m3u8
#EXTINF:-1 tvg-id="4" tvg-name="CCTV4" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV4.png" group-title="CCTV",CCTV-4
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225781/index.m3u8
#EXTINF:-1 tvg-id="5" tvg-name="CCTV5" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5.png" group-title="CCTV",CCTV-5
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225780/index.m3u8
#EXTINF:-1 tvg-id="5" tvg-name="CCTV5" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5.png" group-title="CCTV",CCTV-5
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226396/index.m3u8
#EXTINF:-1 tvg-id="5" tvg-name="CCTV5" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV5.png" group-title="CCTV",CCTV-5
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225837/index.m3u8
#EXTINF:-1 tvg-id="7" tvg-name="CCTV6" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV6.png" group-title="CCTV",CCTV-6
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225779/index.m3u8
#EXTINF:-1 tvg-id="7" tvg-name="CCTV6" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV6.png" group-title="CCTV",CCTV-6
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226394/index.m3u8
#EXTINF:-1 tvg-id="8" tvg-name="CCTV7" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV7.png" group-title="CCTV",CCTV-7
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225778/index.m3u8
#EXTINF:-1 tvg-id="9" tvg-name="CCTV8" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV8.png" group-title="CCTV",CCTV-8
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225759/index.m3u8
#EXTINF:-1 tvg-id="9" tvg-name="CCTV8" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV8.png" group-title="CCTV",CCTV-8
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226407/index.m3u8
#EXTINF:-1 tvg-id="10" tvg-name="CCTV9" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV9.png" group-title="CCTV",CCTV-9
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225758/index.m3u8
#EXTINF:-1 tvg-id="11" tvg-name="CCTV10" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV10.png" group-title="CCTV",CCTV-10
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225777/index.m3u8
#EXTINF:-1 tvg-id="12" tvg-name="CCTV11" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV11.png" group-title="CCTV",CCTV-11
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226240/index.m3u8
#EXTINF:-1 tvg-id="12" tvg-name="CCTV11" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV11.png" group-title="CCTV",CCTV-11
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225776/index.m3u8
#EXTINF:-1 tvg-id="13" tvg-name="CCTV12" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV12.png" group-title="CCTV",CCTV-12
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225775/index.m3u8
#EXTINF:-1 tvg-id="14" tvg-name="CCTV13" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV13.png" group-title="CCTV",CCTV-13 News
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226233/index.m3u8
#EXTINF:-1 tvg-id="14" tvg-name="CCTV13" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV13.png" group-title="CCTV",CCTV-13 News
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225617/index.m3u8
#EXTINF:-1 tvg-id="14" tvg-name="CCTV13" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV13.png" group-title="CCTV",CCTV-13 News
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225774/index.m3u8
#EXTINF:-1 tvg-id="15" tvg-name="CCTV14" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV14.png" group-title="CCTV",CCTV-14
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225784/index.m3u8
#EXTINF:-1 tvg-id="16" tvg-name="CCTV15" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV15.png" group-title="CCTV",CCTV-15 Music
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225785/index.m3u8
#EXTINF:-1 tvg-id="17" tvg-name="CCTV17" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/CCTV17.png" group-title="CCTV",CCTV-17
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226208/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",IPTV3+
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226341/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",IPTV5+
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226342/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",IPTV6+
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226343/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",IPTV8+
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226344/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",IPTV相声小品
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226346/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中央新影发现之旅
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226235/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中央新影老故事
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226236/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",CCTV女性时尚
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226237/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中国教育1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225753/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中国教育2
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225756/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中国教育3
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226226/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中国教育4
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226225/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="CCTV",中国交通
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226248/index.m3u8

#EXTINF:-1 tvg-id="20" tvg-name="CGTN" tvg-logo="http://epg.51zmt.top:8000/tb1/CCTV/cgtn.png" group-title="CCTV",CGTN
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225745/index.m3u8

#EXTINF:-1 tvg-id="30" tvg-name="北京卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/beijing.png" group-title="LocalTV",北京卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225790/index.m3u8
#EXTINF:-1 tvg-id="67" tvg-name="卡酷动画" tvg-logo="http://epg.51zmt.top:8000/tb1/qt/kaku.png" group-title="LocalTV",卡酷少儿
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225743/index.m3u8
#EXTINF:-1 tvg-id="34" tvg-name="深圳卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shenzhen.png" group-title="LocalTV",深圳卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225752/index.m3u8
#EXTINF:-1 tvg-id="32" tvg-name="安徽卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/anhui.png" group-title="LocalTV",安徽卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225773/index.m3u8
#EXTINF:-1 tvg-id="47" tvg-name="河南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/henan.png" group-title="LocalTV",河南卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225767/index.m3u8
#EXTINF:-1 tvg-id="55" tvg-name="陕西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi.png" group-title="LocalTV",陕西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225821/index.m3u8
#EXTINF:-1 tvg-id="55" tvg-name="陕西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi.png" group-title="LocalTV",陕西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226322/index.m3u8
#EXTINF:-1 tvg-id="55" tvg-name="陕西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi.png" group-title="LocalTV",陕西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226326/index.m3u8
#EXTINF:-1 tvg-id="55" tvg-name="陕西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi.png" group-title="LocalTV",陕西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226331/index.m3u8
#EXTINF:-1 tvg-id="55" tvg-name="陕西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi.png" group-title="LocalTV",陕西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226457/index.m3u8
#EXTINF:-1 tvg-id="33" tvg-name="广东卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/guangdong.png" group-title="LocalTV",广东卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225757/index.m3u8
#EXTINF:-1 tvg-id="38" tvg-name="山东卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shandong.png" group-title="LocalTV",山东卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225771/index.m3u8
#EXTINF:-1 tvg-id="48" tvg-name="湖北卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hubei.png" group-title="LocalTV",湖北卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225760/index.m3u8
#EXTINF:-1 tvg-id="45" tvg-name="河北卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hebei.png" group-title="LocalTV",河北卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225750/index.m3u8
#EXTINF:-1 tvg-id="71" tvg-name="西藏卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/xizang.png" group-title="LocalTV",西藏卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226212/index.m3u8
#EXTINF:-1 tvg-id="52" tvg-name="内蒙古卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/neimeng.png" group-title="LocalTV",内蒙古卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225786/index.m3u8
#EXTINF:-1 tvg-id="56" tvg-name="四川卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/sichuan.png" group-title="LocalTV",四川卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225768/index.m3u8
#EXTINF:-1 tvg-id="29" tvg-name="江苏卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jiangsu.png" group-title="LocalTV",江苏卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225746/index.m3u8
#EXTINF:-1 tvg-id="39" tvg-name="天津卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/tianjin.png" group-title="LocalTV",天津卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225765/index.m3u8
#EXTINF:-1 tvg-id="36" tvg-name="辽宁卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/liaoning.png" group-title="LocalTV",辽宁卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225772/index.m3u8
#EXTINF:-1 tvg-id="68" tvg-name="厦门卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/xiamen.png" group-title="LocalTV",厦门卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226219/index.m3u8
#EXTINF:-1 tvg-id="57" tvg-name="新疆卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/xinjiang.png" group-title="LocalTV",新疆卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225747/index.m3u8
#EXTINF:-1 tvg-id="27" tvg-name="湖南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/hunan.png" group-title="LocalTV",湖南卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225787/index.m3u8
#EXTINF:-1 tvg-id="58" tvg-name="云南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/yunnan.png" group-title="LocalTV",云南卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225751/index.m3u8
#EXTINF:-1 tvg-id="41" tvg-name="东南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongnan.png" group-title="LocalTV",福建东南卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225766/index.m3u8
#EXTINF:-1 tvg-id="28" tvg-name="浙江卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/zhejiang.png" group-title="LocalTV",浙江卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225788/index.m3u8
#EXTINF:-1 tvg-id="44" tvg-name="贵州卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/guizhou.png" group-title="LocalTV",贵州卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225793/index.m3u8
#EXTINF:-1 tvg-id="42" tvg-name="甘肃卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/gansu.png" group-title="LocalTV",甘肃卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225754/index.m3u8
#EXTINF:-1 tvg-id="40" tvg-name="重庆卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/chongqing.png" group-title="LocalTV",重庆卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225791/index.m3u8
#EXTINF:-1 tvg-id="51" tvg-name="吉林卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jilin.png" group-title="LocalTV",吉林卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225792/index.m3u8
#EXTINF:-1 tvg-id="43" tvg-name="广西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/guangxi.png" group-title="LocalTV",广西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225770/index.m3u8
#EXTINF:-1 tvg-id="59" tvg-name="青海卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/qinghai.png" group-title="LocalTV",青海卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225794/index.m3u8
#EXTINF:-1 tvg-id="54" tvg-name="山西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/shanxi_.png" group-title="LocalTV",山西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225763/index.m3u8
#EXTINF:-1 tvg-id="31" tvg-name="东方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongfang.png" group-title="LocalTV",东方卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225789/index.m3u8
#EXTINF:-1 tvg-id="31" tvg-name="东方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/dongfang.png" group-title="LocalTV",东方卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225599/index.m3u8
#EXTINF:-1 tvg-id="50" tvg-name="江西卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/jiangxi.png" group-title="LocalTV",江西卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225764/index.m3u8
#EXTINF:-1 tvg-id="53" tvg-name="宁夏卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/ningxia.png" group-title="LocalTV",宁夏卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225748/index.m3u8
#EXTINF:-1 tvg-id="29" tvg-name="海南卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/lvyou.png" group-title="LocalTV",海南卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225769/index.m3u8
#EXTINF:-1 tvg-id="51" tvg-name="广东南方卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/lvyou.png" group-title="LocalTV",广东南方卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226218/index.m3u8
#EXTINF:-1 tvg-id="61" tvg-name="兵团卫视" tvg-logo="http://epg.51zmt.top:8000/tb1/ws/bingtuan.png" group-title="LocalTV",兵团卫视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226214/index.m3u8

#EXTINF:-1 tvg-id="142" tvg-name="凤凰资讯" tvg-logo="http://epg.51zmt.top:8000/tb1/gt/fenghuangzixun.png" group-title="LocalTV",凤凰卫视资讯台
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226546/index.m3u8
#EXTINF:-1 tvg-id="141" tvg-name="凤凰中文" tvg-logo="http://epg.51zmt.top:8000/tb1/gt/fenghuangzhongwen.png" group-title="LocalTV",凤凰卫视中文台
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226547/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",山东教育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226238/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",足球
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226347/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",台球
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226348/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",栾坛春秋
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226245/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",生态环境
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226243/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",京视剧场
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226242/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",上海哈哈炫动
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226213/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",广东嘉佳卡通
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226227/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",江苏优漫卡通
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225795/index.m3u8

#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",湖南金鹰卡通
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225744/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百事通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225850/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225834/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225835/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225836/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225839/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225845/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通超级体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225848/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通超级体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225849/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",百视通超级体育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221225847/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西体育休闲
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226363/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西公共
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226361/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西影视
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226360/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西新闻资讯
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226357/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西生活
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226358/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西生活
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226359/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕西西部电影
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226364/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",陕视直播
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226408/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安1
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226366/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安2
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226367/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安3
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226368/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安4
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226369/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安丝路
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226370/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安教育
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226371/index.m3u8
#EXTINF:-1 tvg-id="" tvg-name="" tvg-logo="" group-title="LocalTV",西安新闻综合
http://dbiptv.sn.chinamobile.com/PLTV/88888890/224/3221226386/index.m3u8
"""