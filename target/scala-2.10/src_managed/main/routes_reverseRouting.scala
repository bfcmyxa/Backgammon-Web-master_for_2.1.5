// @SOURCE:E:/GitHub/Backgammon-Web-master_for_2.1.5/Backgammon-Web-master/conf/routes
// @HASH:353440427f3d1a0ce23433309259e3c33c6493ec
// @DATE:Mon Jan 13 10:56:46 CET 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers {

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def json(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "json")
}
                                                

// @LINE:6
def click(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "game")
}
                                                

// @LINE:5
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.javascript {

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def json : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.json",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "json"})
      }
   """
)
                        

// @LINE:6
def click : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.click",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "game"})
      }
   """
)
                        

// @LINE:5
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:10
// @LINE:7
// @LINE:6
// @LINE:5
package controllers.ref {

// @LINE:7
// @LINE:6
// @LINE:5
class ReverseApplication {
    

// @LINE:7
def json(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).json(), HandlerDef(this, "controllers.Application", "json", Seq(), "POST", """""", _prefix + """json""")
)
                      

// @LINE:6
def click(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   play.api.Play.maybeApplication.map(_.global).getOrElse(play.api.DefaultGlobal).getControllerInstance(classOf[controllers.Application]).click(), HandlerDef(this, "controllers.Application", "click", Seq(), "GET", """""", _prefix + """game""")
)
                      

// @LINE:5
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """""", _prefix + """""")
)
                      
    
}
                          

// @LINE:10
class ReverseAssets {
    

// @LINE:10
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      