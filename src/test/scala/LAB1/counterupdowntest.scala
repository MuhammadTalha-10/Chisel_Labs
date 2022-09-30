package LAB1
import chisel3._
import org.scalatest._
import chiseltest._

class countupdown extends FreeSpec with ChiselScalatestTester{
    "countupdown test" in{
        test(new counter_up_down(3)){
            C =>
            C.clock.step(100)
        }
    }
}