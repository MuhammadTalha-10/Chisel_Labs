package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class shiftregtest extends FreeSpec with ChiselScalatestTester{
    "shftreg test" in {
        test(new shft_reg){
            C =>
            C.io.in.poke(6.U)
            C.clock.step(100)
        }
    }
}