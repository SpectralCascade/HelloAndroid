#include <string>
#include <jni.h>

extern "C" {

    JNIEXPORT jstring JNICALL Java_com_example_helloandroid_NativeWrapper_GetBackgroundText(JNIEnv *env, jobject self) {
        std::string test = "Hello, World!";
        jstring javaString = env->NewStringUTF(test.c_str());
        return javaString;
    }

}
