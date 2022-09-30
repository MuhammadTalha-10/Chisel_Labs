package LAB8

import chisel3._
import org.scalatest._
import chiseltest._

class MaskedRWSmemTest extends FreeSpec with ChiselScalatestTester{
    "mask overloading" in {
        test(new MaskedRWSmem){
            C =>
            C.io.dataIn(2).poke(4.U)
            C.io.enable.poke(1.B)
            C.io.write.poke(1.B)
            C.io.mask(2).poke(0.B)
            C.io.addr.poke(10.U)
            C.clock.step(100)
        }
    }
}