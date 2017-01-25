package br.com.caelum.fj91.criacaodata.dsl;
 
class ScalaClass {
    def greet() {
        val delegate = new ScalaClass
        delegate.greet()
    }
}