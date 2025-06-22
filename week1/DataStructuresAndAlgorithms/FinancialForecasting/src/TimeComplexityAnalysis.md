## Compound Interest Calculation

To calculate CI for n years, we need
1. Principle = **A(0)**
2. Rate of Interest **(r)**
3. Time (in years) **(n or t)**

With these, Compound Interest after 'n' years, i.e.,

`A(n) = A(n-1) * (r + 1)`

with `A(0) = principle`

Here, we can see that the CI of the current depends on the CI of the past year, so we can appy recursion here to calculate the CI of previous year and then solve it for current year.

### Program
```Java
private static double forecastCompoundInterest(double principle, double interestRate, int time) {
        if (time <= 0) {
            return principle;
        }

        double previousCompoundInterest = forecastCompoundInterest(principle, interestRate, time-1);
        return (1 + interestRate) * previousCompoundInterest;
    }
```

The above program recursively calculates the CI of previous year before the CI of current year, although there is no particular need of Recursion here, we can see how the we were able to calculate the right values with past data.

### Example Test Case
```
Enter the principle: 
10000
Enter interest rate: 
0.08
Enter the time(in years): 
5
The compound interest in 5 years is: ₹14693.28
```
### Time Complexity
This is a tail-recursive function (though Java doesn't optimize tail calls).

Each recursive call only makes one other recursive call — so the recursion goes straight down from time to 0.

Time Complexity will be

`T(n) = T(n-1) + O(1)  
     = O(n)`

Space Complexity will be `O(n)`.

### Optimizations
Actually, there is a direct math formula that we can use to reduce the time complexity from `O(n)` to Constant time.

Whic is, 
`A=P×(1+r)^t`, making the optimized Time Complexity = `O(1)`.

This also optimizes the Space Complexity making the Optimized Space Complexity = `O(1)` i.e., Constant Time.