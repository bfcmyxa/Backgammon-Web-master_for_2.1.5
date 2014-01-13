
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>
<html>
<head>
    <title>"""),_display_(Seq[Any](/*6.13*/title)),format.raw/*6.18*/("""</title>
    <link rel='shortcut icon' type='image/png' href='"""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("images/favicon.png"))),format.raw/*7.93*/("""'>
    <link rel='stylesheet' href='"""),_display_(Seq[Any](/*8.35*/routes/*8.41*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.84*/("""'>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*9.42*/routes/*9.48*/.Assets.at("javascripts/jquery-1.10.2.min.js"))),format.raw/*9.94*/(""""></script>
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*10.42*/routes/*10.48*/.Assets.at("javascripts/jquery-migrate-1.2.1.min.js"))),format.raw/*10.101*/(""""></script>
    <style>
    body """),format.raw/*12.10*/("""{"""),format.raw/*12.11*/("""
        margin-top: 50px;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""
    </style>
</head>
<body>
    <div class="navbar navbar-fixed-top">
        <div class="navbar-inner">
            <div class="container-fluid">
                <a id="titleLink" class="brand" href="/">"""),_display_(Seq[Any](/*21.59*/title)),format.raw/*21.64*/("""</a>
            </div>
        </div>
    </div>
    <div class="container">
        """),_display_(Seq[Any](/*26.10*/content)),format.raw/*26.17*/("""
    </div>
</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 13 10:56:52 CET 2014
                    SOURCE: E:/GitHub/Backgammon-Web-master_for_2.1.5/Backgammon-Web-master/app/views/main.scala.html
                    HASH: f27be32d69f1870d3ba3555ae9035811b58b710f
                    MATRIX: 727->1|834->31|913->75|939->80|1037->143|1051->149|1104->181|1176->218|1190->224|1254->267|1333->311|1347->317|1414->363|1503->416|1518->422|1594->475|1655->508|1684->509|1742->540|1770->541|2012->747|2039->752|2162->839|2191->846
                    LINES: 26->1|29->1|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|42->14|42->14|49->21|49->21|54->26|54->26
                    -- GENERATED --
                */
            