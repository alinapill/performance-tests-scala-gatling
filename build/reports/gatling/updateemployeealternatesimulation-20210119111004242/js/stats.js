var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "256",
        "ok": "255",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "2807",
        "ok": "2807",
        "ko": "59874"
    },
    "maxResponseTime": {
        "total": "59874",
        "ok": "56636",
        "ko": "59874"
    },
    "meanResponseTime": {
        "total": "25635",
        "ok": "25501",
        "ko": "59874"
    },
    "standardDeviation": {
        "total": "14607",
        "ok": "14477",
        "ko": "0"
    },
    "percentiles1": {
        "total": "23091",
        "ok": "22933",
        "ko": "59874"
    },
    "percentiles2": {
        "total": "37836",
        "ok": "37655",
        "ko": "59874"
    },
    "percentiles3": {
        "total": "50471",
        "ok": "50095",
        "ko": "59874"
    },
    "percentiles4": {
        "total": "54883",
        "ok": "53478",
        "ko": "59874"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 255,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 1,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "4.267",
        "ok": "4.25",
        "ko": "0.017"
    }
},
contents: {
"req_-post--update-e-2b8a9": {
        type: "REQUEST",
        name: "[POST] Update employee",
path: "[POST] Update employee",
pathFormatted: "req_-post--update-e-2b8a9",
stats: {
    "name": "[POST] Update employee",
    "numberOfRequests": {
        "total": "256",
        "ok": "255",
        "ko": "1"
    },
    "minResponseTime": {
        "total": "2807",
        "ok": "2807",
        "ko": "59874"
    },
    "maxResponseTime": {
        "total": "59874",
        "ok": "56636",
        "ko": "59874"
    },
    "meanResponseTime": {
        "total": "25635",
        "ok": "25501",
        "ko": "59874"
    },
    "standardDeviation": {
        "total": "14607",
        "ok": "14477",
        "ko": "0"
    },
    "percentiles1": {
        "total": "23091",
        "ok": "22933",
        "ko": "59874"
    },
    "percentiles2": {
        "total": "37836",
        "ok": "37655",
        "ko": "59874"
    },
    "percentiles3": {
        "total": "50471",
        "ok": "50095",
        "ko": "59874"
    },
    "percentiles4": {
        "total": "54883",
        "ok": "53478",
        "ko": "59874"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 0,
    "percentage": 0
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 255,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 1,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "4.267",
        "ok": "4.25",
        "ko": "0.017"
    }
}
    }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
