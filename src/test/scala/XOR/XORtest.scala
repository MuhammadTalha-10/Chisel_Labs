package XOR
import chisel3._
import org.scalatest._
import chiseltest._

class XORtest extends FreeSpec with ChiselScalatestTester{
    "XOR Gate test" in{
        test(new XOR()){
            C =>
            C.io.a.poke(1.U)
            C.io.b.poke(1.U)
            C.clock.step(5)
            C.io.c.expect(0.U)
        } 
    } 
}