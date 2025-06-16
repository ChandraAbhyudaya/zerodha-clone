package service

import java.time.Instant
import java.util.UUID
import scala.concurrent.Future

case class User(id : UUID, email : String, passwordHash : String, kycStatus : Boolean)
case class Session(token : String, userId : UUID, expiry : Instant)

trait UserService {
  def register(email : String, password : String) : Future[User]
  def login(email : String, password : String) : Future[Session]
  def verifyKYC(user: UUID) : Future[Boolean]
}
