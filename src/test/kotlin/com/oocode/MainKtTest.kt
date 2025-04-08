package com.oocode

import calcCal
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class findTotal {

    @Test
    fun `findTotal`() {
        assertThat(calcCal("""1000
2000
3000

4000

5000
6000

7000
8000
9000

10000"""), equalTo("24000"))
    }
}


class findTotalsingleElf {


    @Test
    fun `findTotalsingleElf`() {
        assertThat(calcCal("1000"), equalTo("1000"))
    }

    @Test
    fun `findTwoElfoneitem` () {
        assertThat(calcCal("""1000

2000""".trimMargin()), equalTo("2000"))
    }


    @Test
    fun findHighestElftwoitem () {
        assertThat(calcCal("""1000
3000

2000""".trimMargin()), equalTo("5000"))
    }

}