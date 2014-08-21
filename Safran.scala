import scala.xml.XML

object Safran extends App {
    XML.load("http://www.safran.io/feed.rss") \\ "item" map { item =>
      (item \ "title", item \ "link")
    } take(10) foreach {
      case (title, link) =>
        println(s"${Console.YELLOW} ${title.text} \n${Console.WHITE} ${link.text}")
    }
}
