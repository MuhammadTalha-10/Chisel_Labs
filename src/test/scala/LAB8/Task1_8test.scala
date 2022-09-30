package LAB8

import chisel3._
import org.scalatest._
import chiseltest._

class fourbankedmemarbtest extends FreeSpec with ChiselScalatestTester{
    "4 banked mem arb test" in {
        test(new memory_assignment){
            C =>
            C.io.Readaddr.poke(4.U)
            C.io.Writeaddr.poke(4.U)
            C.io.requestor(0).bits.poke(2.U)
            C.io.requestor(0).valid.poke(1.B)
            C.io.requestor(1).valid.poke(0.B)
            C.io.requestor(2).valid.poke(0.B)
            C.io.requestor(3).valid.poke(0.B)
            C.io.write_en.poke(1.B)
            C.clock.step(100)
        }
    }
}
            