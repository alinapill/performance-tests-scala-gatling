var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "20",
        "ok": "20",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "6258",
        "ok": "6258",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "16419",
        "ok": "16419",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "11662",
        "ok": "11662",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3127",
        "ok": "3127",
        "ko": "-"
    },
    "percentiles1": {
        "total": "12362",
        "ok": "12362",
        "ko": "-"
    },
    "percentiles2": {
        "total": "14400",
        "ok": "14400",
        "ko": "-"
    },
    "percentiles3": {
        "total": "16418",
        "ok": "16418",
        "ko": "-"
    },
    "percentiles4": {
        "total": "16419",
        "ok": "16419",
        "ko": "-"
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
    "count": 20,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.111",
        "ok": "1.111",
        "ko": "-"
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
        "total": "20",
        "ok": "20",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "6258",
        "ok": "6258",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "16419",
        "ok": "16419",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "11662",
        "ok": "11662",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "3127",
        "ok": "3127",
        "ko": "-"
    },
    "percentiles1": {
        "total": "12362",
        "ok": "12362",
        "ko": "-"
    },
    "percentiles2": {
        "total": "14400",
        "ok": "14400",
        "ko": "-"
    },
    "percentiles3": {
        "total": "16418",
        "ok": "16418",
        "ko": "-"
    },
    "percentiles4": {
        "total": "16419",
        "ok": "16419",
        "ko": "-"
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
    "count": 20,
    "percentage": 100
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.111",
        "ok": "1.111",
        "ko": "-"
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
