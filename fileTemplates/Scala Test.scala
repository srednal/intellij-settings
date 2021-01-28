#if ((${PACKAGE_NAME} && ${PACKAGE_NAME} != ""))package ${PACKAGE_NAME} #end
#parse("File Header.java")

import org.scalatest._

class ${NAME} extends WordSpec with Matchers {

  "The ${NAME.replaceAll("(^Test)|(Test$)","")}" should {
  
    "foo" in {
    
      "x" shouldBe "x"
    
    }
  }
}
