package com.trustwallet.core.app.utils

fun ByteArray.toHex(): String {
    return Numeric.toHexString(this)
}

fun ByteArray.toHexString(): String {
    return Numeric.toHexString(this, false)
}

fun String.toHexBytes(): ByteArray {
    return Numeric.hexStringToByteArray(this)
}

fun String.toHexByteArray(): ByteArray {
    return  Numeric.hexStringToByteArray(this)
}