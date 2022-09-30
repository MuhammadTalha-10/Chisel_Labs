package LAB7

import chisel3._
import org.scalatest._
import chiseltest._

class FSMtest extends FreeSpec with ChiselScalatestTester{
    " FSM tets" in{
        test(new MyFSM){
            C =>
            C.io.f1.poke(1.B)
            C.io.f2.poke(1.B)
            C.io.r1.poke(1.B)
            C.io.r2.poke(1.B)
            C.clock.step(100)
        }
    }
}