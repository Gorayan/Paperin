package net.gorayan.mc.paperin.item

import org.bukkit.persistence.PersistentDataAdapterContext
import org.bukkit.persistence.PersistentDataType

class CustomPersistentDataType<T : Any, Z : Any>(
    private val primitiveType: Class<T>,
    private val complexType: Class<Z>,
    private val toPrimitive: Z.(PersistentDataAdapterContext) -> T,
    private val toComplex: T.(PersistentDataAdapterContext) -> Z
) : PersistentDataType<T, Z> {

    override fun getPrimitiveType(): Class<T> = primitiveType

    override fun getComplexType(): Class<Z> = complexType

    override fun toPrimitive(complex: Z, context: PersistentDataAdapterContext): T = complex.toPrimitive(context)

    override fun fromPrimitive(primitive: T, context: PersistentDataAdapterContext): Z = primitive.toComplex(context)

    companion object {

        inline fun <reified T : Any, reified Z : Any> typeOf(
            noinline toPrimitive: Z.(PersistentDataAdapterContext) -> T,
            noinline toComplex: T.(PersistentDataAdapterContext) -> Z
        ): CustomPersistentDataType<T, Z> {
            return CustomPersistentDataType(
                T::class.java,
                Z::class.java,
                toPrimitive,
                toComplex
            )
        }

    }

}