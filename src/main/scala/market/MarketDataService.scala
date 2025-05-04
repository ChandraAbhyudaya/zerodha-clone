package market

import java.time.Instant
import scala.concurrent.Future
import akka.NotUsed
import akka.stream.scaladsl.Source

case class Stock(symbol : String, exchange : String, lastPrice : BigDecimal, timestamp : Instant)


trait MarketDataService {
  def getLivePrice(symbol : String) : Future[Stock]
  def subscribeToTicker(symbol: String) : Source[Stock, NotUsed]
}
