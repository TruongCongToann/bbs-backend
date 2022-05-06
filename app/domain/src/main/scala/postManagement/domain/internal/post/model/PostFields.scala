package  domain.src.main.scala.postManagement.domain.internal.post
import org.joda.time.DateTime
import utility.src.main.scala.postManagement.utility

trait PostFields extends Fields{
  val title: String
  val content: String
  val thumbnail: String
  val author: String
  val created_at: Option[DateTime]
  val updated_at: Option[DateTime]
}
