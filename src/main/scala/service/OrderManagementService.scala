package service

import scala.concurrent.Future

case object Market extends OrderType
case object Limit extends OrderType

case class Order(id : UUID, symbol : String, quantity : Int,
                 price : Optional[BigDecimal], orderType : OrderType, status : String)

trait OrderManagementService {
  def placeOrder(order: Order): Future[Order]
  def modifyOrder(orderId: UUID, price : Option[BigDecimal]): Future[Order]
  def cancelOrder(orderId: UUID): Future[Boolean]

}
