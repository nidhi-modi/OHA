package com.tandg.qualitysheet.webservice;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpreadsheetWebService {

    @POST("1FAIpQLSeFAlwxFy4ixkN_71UPrNLOCaJbNyPXD8TGCp-5EtYh7HhwNA/formResponse")
    @FormUrlEncoded
    Call<Void> completeQualityQuestionnaireV2(
            @Field("entry.880516821")  String workerId,
            @Field("entry.1430492217") String jobName,
            @Field("entry.373744288")  String auditorName,
            @Field("entry.389878221")  String houseNumber,
            @Field("entry.247279399")  String weekNumber,
            @Field("entry.668900209")  String workerName,
            @Field("entry.760976391")  String adiCode,
            @Field("entry.1994273709") String rowNumber,
            @Field("entry.1363445947") String qualityData1,
            @Field("entry.790697825")  String qualityData2,
            @Field("entry.1921784399") String qualityData3,
            @Field("entry.806686809")  String qualityData4,
            @Field("entry.479203985")  String qualityData5,
            @Field("entry.1498841540") String qualityData6,
            @Field("entry.488158984")  String qualityData7,
            @Field("entry.57874806")   String qualityData8,
            @Field("entry.1399381046") String comments,
            @Field("entry.1369821809") String qualityPercent
    );



}
