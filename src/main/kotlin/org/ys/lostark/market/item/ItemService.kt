package org.ys.lostark.market.item

import org.springframework.stereotype.Service
import org.ys.lostark.market.crawler.CrawlerService
import org.ys.lostark.market.ocr.OcrService

@Service
class ItemService(
    private val crawlerService: CrawlerService,
    private val ocrService: OcrService,
)
{
    fun progress() {
        val dataList = mutableListOf<Item>()
        dataList.add(crawlerService.getItemInfo("하급 오레하 융화 재료"))
        dataList.addAll(ocrService.getMarketListByOcr("1"))
        dataList.addAll(ocrService.getMarketListByOcr("2"))
        dataList.addAll(ocrService.getMarketListByOcr("3"))
        dataList.addAll(ocrService.getMarketListByOcr("4"))
        println(dataList)
    }
}