package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class ex2_counttest extends FreeSpec with ChiselScalatestTester{
    "count test" in {
        test(new counter(12,3)){
            C =>
            C.clock.step(100)
        }
    }
}
