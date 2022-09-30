package LAB8

import chisel3._
import org.scalatest._
import chiseltest._

class memfrwdtest extends FreeSpec with ChiselScalatestTester{
    "mem frwrdtest" in {
        test(new Forwarding){
            C =>
            C.io.rdAddr.poke(8.U)
            C.io.wrAddr.poke(8.U)
            C.io.wr_en.poke(1.B)
            C.io.wrData(0).poke(2.U)
            C.io.wrData(1).poke(3.U)
            C.io.mask(1).poke(1.B)
            C.clock.step(100)
        }
    }
}
