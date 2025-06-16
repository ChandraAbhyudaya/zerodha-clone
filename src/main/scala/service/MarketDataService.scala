package service

import akka.NotUsed
import akka.stream.scaladsl.Source

import java.time.Instant
import scala.concurrent.Future

case class Stock(symbol : String, exchange : String, lastPrice : BigDecimal, timestamp : Instant)


trait MarketDataService {
  def getLivePrice(symbol : String) : Future[Stock]
  def subscribeToTicker(symbol: String) : Source[Stock, NotUsed]
}
