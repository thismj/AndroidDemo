package cn.thismj.android.library.annotation

import androidx.annotation.RestrictTo

/**
 * Android注解
 *
 * @author aero.tang
 * @since 2020/12/8 14:23
 */
open class AnnotationExample {
    @RestrictTo(RestrictTo.Scope.SUBCLASSES)
    open fun testRestrictTo() {
    }
}