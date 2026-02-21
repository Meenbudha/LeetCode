function expect(val) {
    return {
        toBe(val1) {
            if (val === val1) return true;
            else throw new Error("Not Equal");
        },
        notToBe(val1) {
            if (val !== val1) return true;
            else throw new Error("Equal");
        }
    };
}

console.log(expect(5).toBe(5)); // true
try {
    console.log(expect(5).notToBe(5));
} catch (e) {
    console.error("Assertion failed:", e.message);
}