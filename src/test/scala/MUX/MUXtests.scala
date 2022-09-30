package MUX
import chisel3._
import org.scalatest._
import chiseltest._

class MUXtests extends FreeSpec with ChiselScalatestTester{
    "MUX test" in{
        test(new MUX()){
            C=>
            C.io.inp1.poke(1.U)
            C.io.inp2.poke(1.U)
            C.io.selc.poke(1.U)
            C.clock.step(5)
            C.io.out.expect(0.U)
        } 
    } 
}