# kotlin-racingcar-precourse

## Overview
A simple command-line racing game where cars move based on random values. Users input car names and the number of rounds.

## Feature List

- [x] Accept car names as input (comma-separated, max 5 characters each)
- [x] Accept number of rounds as input
- [x] Validate inputs and throw IllegalArgumentException on failure
- [x] Move cars if random number (0–9) is 4 or greater
- [x] Display car position using hyphens after each round
- [x] Determine winner(s) based on max position
- [x] Support multiple winners when tied

## How to Run
- Kotlin 1.9.24
- Run with: `./gradlew clean test`

## Coding Guidelines
- Only use `camp.nextstep.edu.missionutils.Randoms` and `Console`
- Follow Kotlin conventions (2-level indent, single-responsibility functions)