fun decodeLevel6 (encrypted: String): String {
    val bytes = encrypted.toByteArray()
    val decrypted = mutableListOf<Byte>()

    for (i in encrypted.indices) {
        decrypted.add((bytes[i] - i).toByte())
    }

    return String(decrypted.toByteArray())
}
