package min;


//package java.lang;
import java.util.Random;

import sun.misc.FloatConsts;
import sun.misc.DoubleConsts;

/**
 * The class {@code Math} contains methods for performing basic
 * numeric operations such as the elementary exponential, logarithm,
 * square root, and trigonometric functions.
 *
 * <p>Unlike some of the numeric methods of class
 * {@code StrictMath}, all implementations of the equivalent
 * functions of class {@code Math} are not defined to return the
 * bit-for-bit same results.  This relaxation permits
 * better-performing implementations where strict reproducibility is
 * not required.
 *
 * <p>By default many of the {@code Math} methods simply call
 * the equivalent method in {@code StrictMath} for their
 * implementation.  Code generators are encouraged to use
 * platform-specific native libraries or microprocessor instructions,
 * where available, to provide higher-performance implementations of
 * {@code Math} methods.  Such higher-performance
 * implementations still must conform to the specification for
 * {@code Math}.
 *
 * <p>The quality of implementation specifications concern two
 * properties, accuracy of the returned result and monotonicity of the
 * method.  Accuracy of the floating-point {@code Math} methods is
 * measured in terms of <i>ulps</i>, units in the last place.  For a
 * given floating-point format, an {@linkplain #ulp(double) ulp} of a
 * specific real number value is the distance between the two
 * floating-point values bracketing that numerical value.  When
 * discussing the accuracy of a method as a whole rather than at a
 * specific argument, the number of ulps cited is for the worst-case
 * error at any argument.  If a method always has an error less than
 * 0.5 ulps, the method always returns the floating-point number
 * nearest the exact result; such a method is <i>correctly
 * rounded</i>.  A correctly rounded method is generally the best a
 * floating-point approximation can be; however, it is impractical for
 * many floating-point methods to be correctly rounded.  Instead, for
 * the {@code Math} class, a larger error bound of 1 or 2 ulps is
 * allowed for certain methods.  Informally, with a 1 ulp error bound,
 * when the exact result is a representable number, the exact result
 * should be returned as the computed result; otherwise, either of the
 * two floating-point values which bracket the exact result may be
 * returned.  For exact results large in magnitude, one of the
 * endpoints of the bracket may be infinite.  Besides accuracy at
 * individual arguments, maintaining proper relations between the
 * method at different arguments is also important.  Therefore, most
 * methods with more than 0.5 ulp errors are required to be
 * <i>semi-monotonic</i>: whenever the mathematical function is
 * non-decreasing, so is the floating-point approximation, likewise,
 * whenever the mathematical function is non-increasing, so is the
 * floating-point approximation.  Not all approximations that have 1
 * ulp accuracy will automatically meet the monotonicity requirements.
 *
 * <p>
 * The platform uses signed two's complement integer arithmetic with
 * int and long primitive types.  The developer should choose
 * the primitive type to ensure that arithmetic operations consistently
 * produce correct results, which in some cases means the operations
 * will not overflow the range of values of the computation.
 * The best practice is to choose the primitive type and algorithm to avoid
 * overflow. In cases where the size is {@code int} or {@code long} and
 * overflow errors need to be detected, the methods {@code addExact},
 * {@code subtractExact}, {@code multiplyExact}, and {@code toIntExact}
 * throw an {@code ArithmeticException} when the results overflow.
 * For other arithmetic operations such as divide, absolute value,
 * increment, decrement, and negation overflow occurs only with
 * a specific minimum or maximum value and should be checked against
 * the minimum or maximum as appropriate.
 *
 * @author  unascribed
 * @author  Joseph D. Darcy
 * @since   JDK1.0
 */

public class Math {

    /**
     * Don't let anyone instantiate this class.
     */
    //private Math() {}

    // Use raw bit-wise conversions on guaranteed non-NaN arguments.
    private static long negativeZeroFloatBits  = Float.floatToRawIntBits(-0.0f);
    
    /**
     * Returns the smaller of two {@code float} values.  That is,
     * the result is the value closer to negative infinity. If the
     * arguments have the same value, the result is that same
     * value. If either value is NaN, then the result is NaN.  Unlike
     * the numerical comparison operators, this method considers
     * negative zero to be strictly smaller than positive zero.  If
     * one argument is positive zero and the other is negative zero,
     * the result is negative zero.
     *
     * @param   a   an argument.
     * @param   b   another argument.
     * @return  the smaller of {@code a} and {@code b}.
     */
    public static float min(float a, float b) {
        if (a != a)
            return a;   // a is NaN
        if ((a == 0.0f) &&
            (b == 0.0f) &&
            (Float.floatToRawIntBits(b) == negativeZeroFloatBits)) {
            // Raw conversion ok since NaN can't map to -0.0.
            return b;
        }
        return (a <= b) ? a : b;
    }
    
}