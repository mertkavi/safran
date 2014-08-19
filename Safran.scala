import scala.xml.XML

object Safran extends App {
	val xml = XML.load("http://www.safran.io/feed.rss")
	val item = (xml \\ "item").map { 
		item => ((item \ "title").text, (item \ "link").text) 
	}
	item.take(10).foreach{ 
		case (title, link)  => println(
			Console.YELLOW + s"$title \n " + Console.WHITE + s"$link")
	}
}