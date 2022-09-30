package LAB6

import chisel3._
import org.scalatest._
import chiseltest._

class countxortest extends FreeSpec with ChiselScalatestTester{
    "count with xor test" in{
        test(new counter_with_xor(4)){C =>
            C.clock.step(100)

        }
    }
}