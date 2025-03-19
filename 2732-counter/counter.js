/**
 * @param {number} n
 * @return {Function} counter
 */
const createCounter = n => () => n++;

// counter() // 10
// counter() // 11
// counter() // 12