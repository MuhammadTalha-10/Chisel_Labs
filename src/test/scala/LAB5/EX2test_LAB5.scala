package LAB5

import chisel3._
import org.scalatest._
import chiseltest._

class EX2test extends FreeSpec with ChiselScalatestTester{
    "Ex2 test" in {
        test (new eMux(UInt(4.W))){
            C =>
            C.io.in1.poke(2.U)
            C.io.in2.poke(1.U)
            C.io.sel.poke(0.B)
            C.clock.step(100)
        }
    }
}