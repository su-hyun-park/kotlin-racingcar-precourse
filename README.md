# kotlin-racingcar-precourse

## Overview
A simple command-line racing game where cars move based on random values. Users input car names and the number of rounds.

## Feature List

- [ ] Accept car names as input (comma-separated, max 5 characters each)
- [ ] Accept number of rounds as input
- [ ] Validate inputs and throw IllegalArgumentException on failure
- [ ] Move cars if random number (0–9) is 4 or greater
- [ ] Display car position using hyphens after each round
- [ ] Determine winner(s) based on max position
- [ ] Support multiple winners when tied

## How to Run
- Kotlin 1.9.24
- Run with: `./gradlew clean test`

## Coding Guidelines
- Only use `camp.nextstep.edu.missionutils.Randoms` and `Console`
- Follow Kotlin conventions (2-level indent, single-responsibility functions)