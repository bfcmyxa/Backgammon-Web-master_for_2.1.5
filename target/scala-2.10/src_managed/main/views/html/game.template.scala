
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object game extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String, status: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play Framework")/*3.35*/ {_display_(Seq[Any](format.raw/*3.37*/("""

<link rel='stylesheet' href='"""),_display_(Seq[Any](/*5.31*/routes/*5.37*/.Assets.at("stylesheets/style.css"))),format.raw/*5.72*/("""'>

<div id="w">
    <canvas id="game" width="720" height="641"></canvas>
    <br>
    <div id="status">"""),_display_(Seq[Any](/*10.23*/status)),format.raw/*10.29*/("""</div>
    <img id="background" src='"""),_display_(Seq[Any](/*11.32*/routes/*11.38*/.Assets.at("images/res/background.png"))),format.raw/*11.77*/("""' class="hidden-image">
    <img id="stoneb" src='"""),_display_(Seq[Any](/*12.28*/routes/*12.34*/.Assets.at("images/res/grau.png"))),format.raw/*12.67*/("""' class="hidden-image">
    <img id="stonew" src='"""),_display_(Seq[Any](/*13.28*/routes/*13.34*/.Assets.at("images/res/weiss.png"))),format.raw/*13.68*/("""' class="hidden-image">
    <img id="dice1" src='"""),_display_(Seq[Any](/*14.27*/routes/*14.33*/.Assets.at("images/res/dice1.png"))),format.raw/*14.67*/("""' class="hidden-image">
    <img id="dice2" src='"""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Assets.at("images/res/dice2.png"))),format.raw/*15.67*/("""' class="hidden-image">
    <img id="dice3" src='"""),_display_(Seq[Any](/*16.27*/routes/*16.33*/.Assets.at("images/res/dice3.png"))),format.raw/*16.67*/("""' class="hidden-image">
    <img id="dice4" src='"""),_display_(Seq[Any](/*17.27*/routes/*17.33*/.Assets.at("images/res/dice4.png"))),format.raw/*17.67*/("""' class="hidden-image">
    <img id="dice5" src='"""),_display_(Seq[Any](/*18.27*/routes/*18.33*/.Assets.at("images/res/dice5.png"))),format.raw/*18.67*/("""' class="hidden-image">
    <img id="dice6" src='"""),_display_(Seq[Any](/*19.27*/routes/*19.33*/.Assets.at("images/res/dice6.png"))),format.raw/*19.67*/("""' class="hidden-image">
</div>
<script src='"""),_display_(Seq[Any](/*21.15*/routes/*21.21*/.Assets.at("javascripts/drawDesk.js"))),format.raw/*21.58*/("""' type="text/javascript"></script>
<script>
    var msg = """),_display_(Seq[Any](/*23.16*/Html(message))),format.raw/*23.29*/(""";

    document.onload = function () """),format.raw/*25.35*/("""{"""),format.raw/*25.36*/("""
        paintComponent(msg);
    """),format.raw/*27.5*/("""}"""),format.raw/*27.6*/(""";

    window.onload = function () """),format.raw/*29.33*/("""{"""),format.raw/*29.34*/("""
        paintComponent(msg);
    """),format.raw/*31.5*/("""}"""),format.raw/*31.6*/(""";
</script>

""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(message:String,status:String): play.api.templates.Html = apply(message,status)
    
    def f:((String,String) => play.api.templates.Html) = (message,status) => apply(message,status)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 10:56:52 CET 2014
                    SOURCE: E:/GitHub/Backgammon-Web-master_for_2.1.5/Backgammon-Web-master/app/views/game.scala.html
                    HASH: b02b0c14a92f8488a48e5771ab2c8da9f5921988
                    MATRIX: 729->1|839->34|876->37|917->70|956->72|1023->104|1037->110|1093->145|1234->250|1262->256|1336->294|1351->300|1412->339|1499->390|1514->396|1569->429|1656->480|1671->486|1727->520|1813->570|1828->576|1884->610|1970->660|1985->666|2041->700|2127->750|2142->756|2198->790|2284->840|2299->846|2355->880|2441->930|2456->936|2512->970|2598->1020|2613->1026|2669->1060|2750->1105|2765->1111|2824->1148|2919->1207|2954->1220|3019->1257|3048->1258|3109->1292|3137->1293|3200->1328|3229->1329|3290->1363|3318->1364|3363->1378
                    LINES: 26->1|29->1|31->3|31->3|31->3|33->5|33->5|33->5|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|51->23|51->23|53->25|53->25|55->27|55->27|57->29|57->29|59->31|59->31|62->34
                    -- GENERATED --
                */
            