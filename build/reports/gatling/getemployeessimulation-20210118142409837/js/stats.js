var stats = {
    type: "GROUP",
name: "Global Information",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "Global Information",
    "numberOfRequests": {
        "total": "28",
        "ok": "28",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "235",
        "ok": "235",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "433",
        "ok": "433",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "264",
        "ok": "264",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "39",
        "ok": "39",
        "ko": "-"
    },
    "percentiles1": {
        "total": "253",
        "ok": "253",
        "ko": "-"
    },
    "percentiles2": {
        "total": "265",
        "ok": "265",
        "ko": "-"
    },
    "percentiles3": {
        "total": "324",
        "ok": "324",
        "ko": "-"
    },
    "percentiles4": {
        "total": "408",
        "ok": "408",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 28,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.4",
        "ok": "1.4",
        "ko": "-"
    }
},
contents: {
"req_get-specific-em-a75e7": {
        type: "REQUEST",
        name: "get_specific_employee",
path: "get_specific_employee",
pathFormatted: "req_get-specific-em-a75e7",
stats: {
    "name": "get_specific_employee",
    "numberOfRequests": {
        "total": "21",
        "ok": "21",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "235",
        "ok": "235",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "433",
        "ok": "433",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "266",
        "ok": "266",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "43",
        "ok": "43",
        "ko": "-"
    },
    "percentiles1": {
        "total": "253",
        "ok": "253",
        "ko": "-"
    },
    "percentiles2": {
        "total": "264",
        "ok": "264",
        "ko": "-"
    },
    "percentiles3": {
        "total": "342",
        "ok": "342",
        "ko": "-"
    },
    "percentiles4": {
        "total": "415",
        "ok": "415",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 21,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "1.05",
        "ok": "1.05",
        "ko": "-"
    }
}
    },"req_get-all-employe-d3c6d": {
        type: "REQUEST",
        name: "get_all_employees",
path: "get_all_employees",
pathFormatted: "req_get-all-employe-d3c6d",
stats: {
    "name": "get_all_employees",
    "numberOfRequests": {
        "total": "7",
        "ok": "7",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "238",
        "ok": "238",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "292",
        "ok": "292",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "258",
        "ok": "258",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "18",
        "ok": "18",
        "ko": "-"
    },
    "percentiles1": {
        "total": "259",
        "ok": "259",
        "ko": "-"
    },
    "percentiles2": {
        "total": "268",
        "ok": "268",
        "ko": "-"
    },
    "percentiles3": {
        "total": "286",
        "ok": "286",
        "ko": "-"
    },
    "percentiles4": {
        "total": "291",
        "ok": "291",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "count": 7,
    "percentage": 100
},
    "group2": {
    "name": "800 ms < t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t > 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "0.35",
        "ok": "0.35",
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
