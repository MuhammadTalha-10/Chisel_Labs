package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class countercasttest extends FreeSpec with ChiselScalatestTester{
    "countercast test" in{
        test(new countcast(4,12.S)){
            C => 
            C.clock.step(100)

        }   
    }
}