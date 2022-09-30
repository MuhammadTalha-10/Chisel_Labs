package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class up_down_6 extends FreeSpec with ChiselScalatestTester{
    "updown count test" in{
        test(new up_down_counter2){
            C =>
            C.clock.step(100)
        }
    }
}