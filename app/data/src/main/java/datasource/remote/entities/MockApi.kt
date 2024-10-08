package datasource.remote.entities

import datasource.remote.mockresponses.mockPromotionsJson
import okhttp3.Interceptor
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.Response
import okhttp3.ResponseBody.Companion.toResponseBody

class MockApi : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()

        if (request.url.encodedPath.endsWith("/promotions")) {

            return Response.Builder()
                .request(request)
                .protocol(chain.connection()?.protocol() ?: okhttp3.Protocol.HTTP_1_1)
                .code(200)
                .message("OK")
                .body(mockPromotionsJson.toResponseBody("application/json".toMediaTypeOrNull()))
                .addHeader("Content-Type", "application/json")
                .build()
        }

        return chain.proceed(request)
    }
}