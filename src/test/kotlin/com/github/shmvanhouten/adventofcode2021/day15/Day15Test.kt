package com.github.shmvanhouten.adventofcode2021.day15

import com.github.shmvanhouten.adventofcode.utility.FileReader.readFile
import com.github.shmvanhouten.adventofcode.utility.coordinate.toIntByCoordinateMap
import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class Day15Test {

    @Nested
    inner class Part1 {

        @Test
        internal fun example() {
            assertThat(findLowestRiskPath(example1.toIntByCoordinateMap()).length, equalTo(40) )
        }

        @Test
        internal fun `part 1`() {
            assertThat(findLowestRiskPath(input.toIntByCoordinateMap()).length, equalTo(562) )
        }
    }

    @Nested
    inner class Part2 {

        @Test
        internal fun example() {
            val expand = expand(example1)
            val expandedRiskMap = expand.toIntByCoordinateMap()
            val path = findLowestRiskPath(expandedRiskMap)
//            println(draw(path.nodes.map { it.location }))
            assertThat(path.length, equalTo(315) )
        }

        @Test
        internal fun `part 2`() {
            val expand = expand(input)
            val expandedRiskMap = expand.toIntByCoordinateMap()
            val path = findLowestRiskPath(expandedRiskMap)
//            println(draw(path.nodes.map { it.location }))
            assertThat(path.length, equalTo(2874) )
        }
    }

    private val input by lazy { readFile("/input-day15.txt")}
    private val example1 = """1163751742
1381373672
2136511328
3694931569
7463417111
1319128137
1359912421
3125421639
1293138521
2311944581"""
}
