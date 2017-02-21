package com.gf.util.string;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public final class CharsIterator {

	public static final void iterate(final String str, final CharConsumer consumer){

		if (str == null)
			return;
		final char[] arr = str.toCharArray();
		final int len = arr.length;
		internalIterate(arr, len, len, consumer);
	}

	public final static void main(final String[] args) throws IOException {
		final int toGenerate = 10240/4;
		final StringBuilder sb = new StringBuilder("final int maxLen = ").append(toGenerate).append(";\n");
		sb.append("switch(len){").append('\n');
		for (int len = toGenerate; len > 0; len--) {
			final int i = len - 1;
			sb.append("case ").append(len).append(':').append('\n');
			sb.append("consumer.onChar(").append(i).append(", arr[").append(i).append("], lenToPass);").append('\n');
		}
		sb.append("break;").append('\n');
		sb.append("default:").append('\n');
		sb.append("internalIterate(arr, maxLen, len, consumer);").append('\n');
		sb.append("for (int i = maxLen; i < len; i++)").append('\n');
		sb.append("consumer.onChar(i, arr[i], len);").append('\n');
		sb.append("break;").append('\n');
		sb.append("}");
		final File f = new File("code.txt");
		f.createNewFile();
		Files.write(f.toPath(), sb.toString().getBytes());
	}

	public static interface CharConsumer{
		void onChar(final int index, final char c, final int length);
	}


	//===========================================================================================================================
	//===============================================GENERATED CODE==============================================================
	//===========================================================================================================================
	private static final void internalIterate(final char[] arr, final int len, final int lenToPass, final CharConsumer consumer){
		final int maxLen = 2560;
		switch(len){
		case 2560:
			consumer.onChar(2559, arr[2559], lenToPass);
		case 2559:
			consumer.onChar(2558, arr[2558], lenToPass);
		case 2558:
			consumer.onChar(2557, arr[2557], lenToPass);
		case 2557:
			consumer.onChar(2556, arr[2556], lenToPass);
		case 2556:
			consumer.onChar(2555, arr[2555], lenToPass);
		case 2555:
			consumer.onChar(2554, arr[2554], lenToPass);
		case 2554:
			consumer.onChar(2553, arr[2553], lenToPass);
		case 2553:
			consumer.onChar(2552, arr[2552], lenToPass);
		case 2552:
			consumer.onChar(2551, arr[2551], lenToPass);
		case 2551:
			consumer.onChar(2550, arr[2550], lenToPass);
		case 2550:
			consumer.onChar(2549, arr[2549], lenToPass);
		case 2549:
			consumer.onChar(2548, arr[2548], lenToPass);
		case 2548:
			consumer.onChar(2547, arr[2547], lenToPass);
		case 2547:
			consumer.onChar(2546, arr[2546], lenToPass);
		case 2546:
			consumer.onChar(2545, arr[2545], lenToPass);
		case 2545:
			consumer.onChar(2544, arr[2544], lenToPass);
		case 2544:
			consumer.onChar(2543, arr[2543], lenToPass);
		case 2543:
			consumer.onChar(2542, arr[2542], lenToPass);
		case 2542:
			consumer.onChar(2541, arr[2541], lenToPass);
		case 2541:
			consumer.onChar(2540, arr[2540], lenToPass);
		case 2540:
			consumer.onChar(2539, arr[2539], lenToPass);
		case 2539:
			consumer.onChar(2538, arr[2538], lenToPass);
		case 2538:
			consumer.onChar(2537, arr[2537], lenToPass);
		case 2537:
			consumer.onChar(2536, arr[2536], lenToPass);
		case 2536:
			consumer.onChar(2535, arr[2535], lenToPass);
		case 2535:
			consumer.onChar(2534, arr[2534], lenToPass);
		case 2534:
			consumer.onChar(2533, arr[2533], lenToPass);
		case 2533:
			consumer.onChar(2532, arr[2532], lenToPass);
		case 2532:
			consumer.onChar(2531, arr[2531], lenToPass);
		case 2531:
			consumer.onChar(2530, arr[2530], lenToPass);
		case 2530:
			consumer.onChar(2529, arr[2529], lenToPass);
		case 2529:
			consumer.onChar(2528, arr[2528], lenToPass);
		case 2528:
			consumer.onChar(2527, arr[2527], lenToPass);
		case 2527:
			consumer.onChar(2526, arr[2526], lenToPass);
		case 2526:
			consumer.onChar(2525, arr[2525], lenToPass);
		case 2525:
			consumer.onChar(2524, arr[2524], lenToPass);
		case 2524:
			consumer.onChar(2523, arr[2523], lenToPass);
		case 2523:
			consumer.onChar(2522, arr[2522], lenToPass);
		case 2522:
			consumer.onChar(2521, arr[2521], lenToPass);
		case 2521:
			consumer.onChar(2520, arr[2520], lenToPass);
		case 2520:
			consumer.onChar(2519, arr[2519], lenToPass);
		case 2519:
			consumer.onChar(2518, arr[2518], lenToPass);
		case 2518:
			consumer.onChar(2517, arr[2517], lenToPass);
		case 2517:
			consumer.onChar(2516, arr[2516], lenToPass);
		case 2516:
			consumer.onChar(2515, arr[2515], lenToPass);
		case 2515:
			consumer.onChar(2514, arr[2514], lenToPass);
		case 2514:
			consumer.onChar(2513, arr[2513], lenToPass);
		case 2513:
			consumer.onChar(2512, arr[2512], lenToPass);
		case 2512:
			consumer.onChar(2511, arr[2511], lenToPass);
		case 2511:
			consumer.onChar(2510, arr[2510], lenToPass);
		case 2510:
			consumer.onChar(2509, arr[2509], lenToPass);
		case 2509:
			consumer.onChar(2508, arr[2508], lenToPass);
		case 2508:
			consumer.onChar(2507, arr[2507], lenToPass);
		case 2507:
			consumer.onChar(2506, arr[2506], lenToPass);
		case 2506:
			consumer.onChar(2505, arr[2505], lenToPass);
		case 2505:
			consumer.onChar(2504, arr[2504], lenToPass);
		case 2504:
			consumer.onChar(2503, arr[2503], lenToPass);
		case 2503:
			consumer.onChar(2502, arr[2502], lenToPass);
		case 2502:
			consumer.onChar(2501, arr[2501], lenToPass);
		case 2501:
			consumer.onChar(2500, arr[2500], lenToPass);
		case 2500:
			consumer.onChar(2499, arr[2499], lenToPass);
		case 2499:
			consumer.onChar(2498, arr[2498], lenToPass);
		case 2498:
			consumer.onChar(2497, arr[2497], lenToPass);
		case 2497:
			consumer.onChar(2496, arr[2496], lenToPass);
		case 2496:
			consumer.onChar(2495, arr[2495], lenToPass);
		case 2495:
			consumer.onChar(2494, arr[2494], lenToPass);
		case 2494:
			consumer.onChar(2493, arr[2493], lenToPass);
		case 2493:
			consumer.onChar(2492, arr[2492], lenToPass);
		case 2492:
			consumer.onChar(2491, arr[2491], lenToPass);
		case 2491:
			consumer.onChar(2490, arr[2490], lenToPass);
		case 2490:
			consumer.onChar(2489, arr[2489], lenToPass);
		case 2489:
			consumer.onChar(2488, arr[2488], lenToPass);
		case 2488:
			consumer.onChar(2487, arr[2487], lenToPass);
		case 2487:
			consumer.onChar(2486, arr[2486], lenToPass);
		case 2486:
			consumer.onChar(2485, arr[2485], lenToPass);
		case 2485:
			consumer.onChar(2484, arr[2484], lenToPass);
		case 2484:
			consumer.onChar(2483, arr[2483], lenToPass);
		case 2483:
			consumer.onChar(2482, arr[2482], lenToPass);
		case 2482:
			consumer.onChar(2481, arr[2481], lenToPass);
		case 2481:
			consumer.onChar(2480, arr[2480], lenToPass);
		case 2480:
			consumer.onChar(2479, arr[2479], lenToPass);
		case 2479:
			consumer.onChar(2478, arr[2478], lenToPass);
		case 2478:
			consumer.onChar(2477, arr[2477], lenToPass);
		case 2477:
			consumer.onChar(2476, arr[2476], lenToPass);
		case 2476:
			consumer.onChar(2475, arr[2475], lenToPass);
		case 2475:
			consumer.onChar(2474, arr[2474], lenToPass);
		case 2474:
			consumer.onChar(2473, arr[2473], lenToPass);
		case 2473:
			consumer.onChar(2472, arr[2472], lenToPass);
		case 2472:
			consumer.onChar(2471, arr[2471], lenToPass);
		case 2471:
			consumer.onChar(2470, arr[2470], lenToPass);
		case 2470:
			consumer.onChar(2469, arr[2469], lenToPass);
		case 2469:
			consumer.onChar(2468, arr[2468], lenToPass);
		case 2468:
			consumer.onChar(2467, arr[2467], lenToPass);
		case 2467:
			consumer.onChar(2466, arr[2466], lenToPass);
		case 2466:
			consumer.onChar(2465, arr[2465], lenToPass);
		case 2465:
			consumer.onChar(2464, arr[2464], lenToPass);
		case 2464:
			consumer.onChar(2463, arr[2463], lenToPass);
		case 2463:
			consumer.onChar(2462, arr[2462], lenToPass);
		case 2462:
			consumer.onChar(2461, arr[2461], lenToPass);
		case 2461:
			consumer.onChar(2460, arr[2460], lenToPass);
		case 2460:
			consumer.onChar(2459, arr[2459], lenToPass);
		case 2459:
			consumer.onChar(2458, arr[2458], lenToPass);
		case 2458:
			consumer.onChar(2457, arr[2457], lenToPass);
		case 2457:
			consumer.onChar(2456, arr[2456], lenToPass);
		case 2456:
			consumer.onChar(2455, arr[2455], lenToPass);
		case 2455:
			consumer.onChar(2454, arr[2454], lenToPass);
		case 2454:
			consumer.onChar(2453, arr[2453], lenToPass);
		case 2453:
			consumer.onChar(2452, arr[2452], lenToPass);
		case 2452:
			consumer.onChar(2451, arr[2451], lenToPass);
		case 2451:
			consumer.onChar(2450, arr[2450], lenToPass);
		case 2450:
			consumer.onChar(2449, arr[2449], lenToPass);
		case 2449:
			consumer.onChar(2448, arr[2448], lenToPass);
		case 2448:
			consumer.onChar(2447, arr[2447], lenToPass);
		case 2447:
			consumer.onChar(2446, arr[2446], lenToPass);
		case 2446:
			consumer.onChar(2445, arr[2445], lenToPass);
		case 2445:
			consumer.onChar(2444, arr[2444], lenToPass);
		case 2444:
			consumer.onChar(2443, arr[2443], lenToPass);
		case 2443:
			consumer.onChar(2442, arr[2442], lenToPass);
		case 2442:
			consumer.onChar(2441, arr[2441], lenToPass);
		case 2441:
			consumer.onChar(2440, arr[2440], lenToPass);
		case 2440:
			consumer.onChar(2439, arr[2439], lenToPass);
		case 2439:
			consumer.onChar(2438, arr[2438], lenToPass);
		case 2438:
			consumer.onChar(2437, arr[2437], lenToPass);
		case 2437:
			consumer.onChar(2436, arr[2436], lenToPass);
		case 2436:
			consumer.onChar(2435, arr[2435], lenToPass);
		case 2435:
			consumer.onChar(2434, arr[2434], lenToPass);
		case 2434:
			consumer.onChar(2433, arr[2433], lenToPass);
		case 2433:
			consumer.onChar(2432, arr[2432], lenToPass);
		case 2432:
			consumer.onChar(2431, arr[2431], lenToPass);
		case 2431:
			consumer.onChar(2430, arr[2430], lenToPass);
		case 2430:
			consumer.onChar(2429, arr[2429], lenToPass);
		case 2429:
			consumer.onChar(2428, arr[2428], lenToPass);
		case 2428:
			consumer.onChar(2427, arr[2427], lenToPass);
		case 2427:
			consumer.onChar(2426, arr[2426], lenToPass);
		case 2426:
			consumer.onChar(2425, arr[2425], lenToPass);
		case 2425:
			consumer.onChar(2424, arr[2424], lenToPass);
		case 2424:
			consumer.onChar(2423, arr[2423], lenToPass);
		case 2423:
			consumer.onChar(2422, arr[2422], lenToPass);
		case 2422:
			consumer.onChar(2421, arr[2421], lenToPass);
		case 2421:
			consumer.onChar(2420, arr[2420], lenToPass);
		case 2420:
			consumer.onChar(2419, arr[2419], lenToPass);
		case 2419:
			consumer.onChar(2418, arr[2418], lenToPass);
		case 2418:
			consumer.onChar(2417, arr[2417], lenToPass);
		case 2417:
			consumer.onChar(2416, arr[2416], lenToPass);
		case 2416:
			consumer.onChar(2415, arr[2415], lenToPass);
		case 2415:
			consumer.onChar(2414, arr[2414], lenToPass);
		case 2414:
			consumer.onChar(2413, arr[2413], lenToPass);
		case 2413:
			consumer.onChar(2412, arr[2412], lenToPass);
		case 2412:
			consumer.onChar(2411, arr[2411], lenToPass);
		case 2411:
			consumer.onChar(2410, arr[2410], lenToPass);
		case 2410:
			consumer.onChar(2409, arr[2409], lenToPass);
		case 2409:
			consumer.onChar(2408, arr[2408], lenToPass);
		case 2408:
			consumer.onChar(2407, arr[2407], lenToPass);
		case 2407:
			consumer.onChar(2406, arr[2406], lenToPass);
		case 2406:
			consumer.onChar(2405, arr[2405], lenToPass);
		case 2405:
			consumer.onChar(2404, arr[2404], lenToPass);
		case 2404:
			consumer.onChar(2403, arr[2403], lenToPass);
		case 2403:
			consumer.onChar(2402, arr[2402], lenToPass);
		case 2402:
			consumer.onChar(2401, arr[2401], lenToPass);
		case 2401:
			consumer.onChar(2400, arr[2400], lenToPass);
		case 2400:
			consumer.onChar(2399, arr[2399], lenToPass);
		case 2399:
			consumer.onChar(2398, arr[2398], lenToPass);
		case 2398:
			consumer.onChar(2397, arr[2397], lenToPass);
		case 2397:
			consumer.onChar(2396, arr[2396], lenToPass);
		case 2396:
			consumer.onChar(2395, arr[2395], lenToPass);
		case 2395:
			consumer.onChar(2394, arr[2394], lenToPass);
		case 2394:
			consumer.onChar(2393, arr[2393], lenToPass);
		case 2393:
			consumer.onChar(2392, arr[2392], lenToPass);
		case 2392:
			consumer.onChar(2391, arr[2391], lenToPass);
		case 2391:
			consumer.onChar(2390, arr[2390], lenToPass);
		case 2390:
			consumer.onChar(2389, arr[2389], lenToPass);
		case 2389:
			consumer.onChar(2388, arr[2388], lenToPass);
		case 2388:
			consumer.onChar(2387, arr[2387], lenToPass);
		case 2387:
			consumer.onChar(2386, arr[2386], lenToPass);
		case 2386:
			consumer.onChar(2385, arr[2385], lenToPass);
		case 2385:
			consumer.onChar(2384, arr[2384], lenToPass);
		case 2384:
			consumer.onChar(2383, arr[2383], lenToPass);
		case 2383:
			consumer.onChar(2382, arr[2382], lenToPass);
		case 2382:
			consumer.onChar(2381, arr[2381], lenToPass);
		case 2381:
			consumer.onChar(2380, arr[2380], lenToPass);
		case 2380:
			consumer.onChar(2379, arr[2379], lenToPass);
		case 2379:
			consumer.onChar(2378, arr[2378], lenToPass);
		case 2378:
			consumer.onChar(2377, arr[2377], lenToPass);
		case 2377:
			consumer.onChar(2376, arr[2376], lenToPass);
		case 2376:
			consumer.onChar(2375, arr[2375], lenToPass);
		case 2375:
			consumer.onChar(2374, arr[2374], lenToPass);
		case 2374:
			consumer.onChar(2373, arr[2373], lenToPass);
		case 2373:
			consumer.onChar(2372, arr[2372], lenToPass);
		case 2372:
			consumer.onChar(2371, arr[2371], lenToPass);
		case 2371:
			consumer.onChar(2370, arr[2370], lenToPass);
		case 2370:
			consumer.onChar(2369, arr[2369], lenToPass);
		case 2369:
			consumer.onChar(2368, arr[2368], lenToPass);
		case 2368:
			consumer.onChar(2367, arr[2367], lenToPass);
		case 2367:
			consumer.onChar(2366, arr[2366], lenToPass);
		case 2366:
			consumer.onChar(2365, arr[2365], lenToPass);
		case 2365:
			consumer.onChar(2364, arr[2364], lenToPass);
		case 2364:
			consumer.onChar(2363, arr[2363], lenToPass);
		case 2363:
			consumer.onChar(2362, arr[2362], lenToPass);
		case 2362:
			consumer.onChar(2361, arr[2361], lenToPass);
		case 2361:
			consumer.onChar(2360, arr[2360], lenToPass);
		case 2360:
			consumer.onChar(2359, arr[2359], lenToPass);
		case 2359:
			consumer.onChar(2358, arr[2358], lenToPass);
		case 2358:
			consumer.onChar(2357, arr[2357], lenToPass);
		case 2357:
			consumer.onChar(2356, arr[2356], lenToPass);
		case 2356:
			consumer.onChar(2355, arr[2355], lenToPass);
		case 2355:
			consumer.onChar(2354, arr[2354], lenToPass);
		case 2354:
			consumer.onChar(2353, arr[2353], lenToPass);
		case 2353:
			consumer.onChar(2352, arr[2352], lenToPass);
		case 2352:
			consumer.onChar(2351, arr[2351], lenToPass);
		case 2351:
			consumer.onChar(2350, arr[2350], lenToPass);
		case 2350:
			consumer.onChar(2349, arr[2349], lenToPass);
		case 2349:
			consumer.onChar(2348, arr[2348], lenToPass);
		case 2348:
			consumer.onChar(2347, arr[2347], lenToPass);
		case 2347:
			consumer.onChar(2346, arr[2346], lenToPass);
		case 2346:
			consumer.onChar(2345, arr[2345], lenToPass);
		case 2345:
			consumer.onChar(2344, arr[2344], lenToPass);
		case 2344:
			consumer.onChar(2343, arr[2343], lenToPass);
		case 2343:
			consumer.onChar(2342, arr[2342], lenToPass);
		case 2342:
			consumer.onChar(2341, arr[2341], lenToPass);
		case 2341:
			consumer.onChar(2340, arr[2340], lenToPass);
		case 2340:
			consumer.onChar(2339, arr[2339], lenToPass);
		case 2339:
			consumer.onChar(2338, arr[2338], lenToPass);
		case 2338:
			consumer.onChar(2337, arr[2337], lenToPass);
		case 2337:
			consumer.onChar(2336, arr[2336], lenToPass);
		case 2336:
			consumer.onChar(2335, arr[2335], lenToPass);
		case 2335:
			consumer.onChar(2334, arr[2334], lenToPass);
		case 2334:
			consumer.onChar(2333, arr[2333], lenToPass);
		case 2333:
			consumer.onChar(2332, arr[2332], lenToPass);
		case 2332:
			consumer.onChar(2331, arr[2331], lenToPass);
		case 2331:
			consumer.onChar(2330, arr[2330], lenToPass);
		case 2330:
			consumer.onChar(2329, arr[2329], lenToPass);
		case 2329:
			consumer.onChar(2328, arr[2328], lenToPass);
		case 2328:
			consumer.onChar(2327, arr[2327], lenToPass);
		case 2327:
			consumer.onChar(2326, arr[2326], lenToPass);
		case 2326:
			consumer.onChar(2325, arr[2325], lenToPass);
		case 2325:
			consumer.onChar(2324, arr[2324], lenToPass);
		case 2324:
			consumer.onChar(2323, arr[2323], lenToPass);
		case 2323:
			consumer.onChar(2322, arr[2322], lenToPass);
		case 2322:
			consumer.onChar(2321, arr[2321], lenToPass);
		case 2321:
			consumer.onChar(2320, arr[2320], lenToPass);
		case 2320:
			consumer.onChar(2319, arr[2319], lenToPass);
		case 2319:
			consumer.onChar(2318, arr[2318], lenToPass);
		case 2318:
			consumer.onChar(2317, arr[2317], lenToPass);
		case 2317:
			consumer.onChar(2316, arr[2316], lenToPass);
		case 2316:
			consumer.onChar(2315, arr[2315], lenToPass);
		case 2315:
			consumer.onChar(2314, arr[2314], lenToPass);
		case 2314:
			consumer.onChar(2313, arr[2313], lenToPass);
		case 2313:
			consumer.onChar(2312, arr[2312], lenToPass);
		case 2312:
			consumer.onChar(2311, arr[2311], lenToPass);
		case 2311:
			consumer.onChar(2310, arr[2310], lenToPass);
		case 2310:
			consumer.onChar(2309, arr[2309], lenToPass);
		case 2309:
			consumer.onChar(2308, arr[2308], lenToPass);
		case 2308:
			consumer.onChar(2307, arr[2307], lenToPass);
		case 2307:
			consumer.onChar(2306, arr[2306], lenToPass);
		case 2306:
			consumer.onChar(2305, arr[2305], lenToPass);
		case 2305:
			consumer.onChar(2304, arr[2304], lenToPass);
		case 2304:
			consumer.onChar(2303, arr[2303], lenToPass);
		case 2303:
			consumer.onChar(2302, arr[2302], lenToPass);
		case 2302:
			consumer.onChar(2301, arr[2301], lenToPass);
		case 2301:
			consumer.onChar(2300, arr[2300], lenToPass);
		case 2300:
			consumer.onChar(2299, arr[2299], lenToPass);
		case 2299:
			consumer.onChar(2298, arr[2298], lenToPass);
		case 2298:
			consumer.onChar(2297, arr[2297], lenToPass);
		case 2297:
			consumer.onChar(2296, arr[2296], lenToPass);
		case 2296:
			consumer.onChar(2295, arr[2295], lenToPass);
		case 2295:
			consumer.onChar(2294, arr[2294], lenToPass);
		case 2294:
			consumer.onChar(2293, arr[2293], lenToPass);
		case 2293:
			consumer.onChar(2292, arr[2292], lenToPass);
		case 2292:
			consumer.onChar(2291, arr[2291], lenToPass);
		case 2291:
			consumer.onChar(2290, arr[2290], lenToPass);
		case 2290:
			consumer.onChar(2289, arr[2289], lenToPass);
		case 2289:
			consumer.onChar(2288, arr[2288], lenToPass);
		case 2288:
			consumer.onChar(2287, arr[2287], lenToPass);
		case 2287:
			consumer.onChar(2286, arr[2286], lenToPass);
		case 2286:
			consumer.onChar(2285, arr[2285], lenToPass);
		case 2285:
			consumer.onChar(2284, arr[2284], lenToPass);
		case 2284:
			consumer.onChar(2283, arr[2283], lenToPass);
		case 2283:
			consumer.onChar(2282, arr[2282], lenToPass);
		case 2282:
			consumer.onChar(2281, arr[2281], lenToPass);
		case 2281:
			consumer.onChar(2280, arr[2280], lenToPass);
		case 2280:
			consumer.onChar(2279, arr[2279], lenToPass);
		case 2279:
			consumer.onChar(2278, arr[2278], lenToPass);
		case 2278:
			consumer.onChar(2277, arr[2277], lenToPass);
		case 2277:
			consumer.onChar(2276, arr[2276], lenToPass);
		case 2276:
			consumer.onChar(2275, arr[2275], lenToPass);
		case 2275:
			consumer.onChar(2274, arr[2274], lenToPass);
		case 2274:
			consumer.onChar(2273, arr[2273], lenToPass);
		case 2273:
			consumer.onChar(2272, arr[2272], lenToPass);
		case 2272:
			consumer.onChar(2271, arr[2271], lenToPass);
		case 2271:
			consumer.onChar(2270, arr[2270], lenToPass);
		case 2270:
			consumer.onChar(2269, arr[2269], lenToPass);
		case 2269:
			consumer.onChar(2268, arr[2268], lenToPass);
		case 2268:
			consumer.onChar(2267, arr[2267], lenToPass);
		case 2267:
			consumer.onChar(2266, arr[2266], lenToPass);
		case 2266:
			consumer.onChar(2265, arr[2265], lenToPass);
		case 2265:
			consumer.onChar(2264, arr[2264], lenToPass);
		case 2264:
			consumer.onChar(2263, arr[2263], lenToPass);
		case 2263:
			consumer.onChar(2262, arr[2262], lenToPass);
		case 2262:
			consumer.onChar(2261, arr[2261], lenToPass);
		case 2261:
			consumer.onChar(2260, arr[2260], lenToPass);
		case 2260:
			consumer.onChar(2259, arr[2259], lenToPass);
		case 2259:
			consumer.onChar(2258, arr[2258], lenToPass);
		case 2258:
			consumer.onChar(2257, arr[2257], lenToPass);
		case 2257:
			consumer.onChar(2256, arr[2256], lenToPass);
		case 2256:
			consumer.onChar(2255, arr[2255], lenToPass);
		case 2255:
			consumer.onChar(2254, arr[2254], lenToPass);
		case 2254:
			consumer.onChar(2253, arr[2253], lenToPass);
		case 2253:
			consumer.onChar(2252, arr[2252], lenToPass);
		case 2252:
			consumer.onChar(2251, arr[2251], lenToPass);
		case 2251:
			consumer.onChar(2250, arr[2250], lenToPass);
		case 2250:
			consumer.onChar(2249, arr[2249], lenToPass);
		case 2249:
			consumer.onChar(2248, arr[2248], lenToPass);
		case 2248:
			consumer.onChar(2247, arr[2247], lenToPass);
		case 2247:
			consumer.onChar(2246, arr[2246], lenToPass);
		case 2246:
			consumer.onChar(2245, arr[2245], lenToPass);
		case 2245:
			consumer.onChar(2244, arr[2244], lenToPass);
		case 2244:
			consumer.onChar(2243, arr[2243], lenToPass);
		case 2243:
			consumer.onChar(2242, arr[2242], lenToPass);
		case 2242:
			consumer.onChar(2241, arr[2241], lenToPass);
		case 2241:
			consumer.onChar(2240, arr[2240], lenToPass);
		case 2240:
			consumer.onChar(2239, arr[2239], lenToPass);
		case 2239:
			consumer.onChar(2238, arr[2238], lenToPass);
		case 2238:
			consumer.onChar(2237, arr[2237], lenToPass);
		case 2237:
			consumer.onChar(2236, arr[2236], lenToPass);
		case 2236:
			consumer.onChar(2235, arr[2235], lenToPass);
		case 2235:
			consumer.onChar(2234, arr[2234], lenToPass);
		case 2234:
			consumer.onChar(2233, arr[2233], lenToPass);
		case 2233:
			consumer.onChar(2232, arr[2232], lenToPass);
		case 2232:
			consumer.onChar(2231, arr[2231], lenToPass);
		case 2231:
			consumer.onChar(2230, arr[2230], lenToPass);
		case 2230:
			consumer.onChar(2229, arr[2229], lenToPass);
		case 2229:
			consumer.onChar(2228, arr[2228], lenToPass);
		case 2228:
			consumer.onChar(2227, arr[2227], lenToPass);
		case 2227:
			consumer.onChar(2226, arr[2226], lenToPass);
		case 2226:
			consumer.onChar(2225, arr[2225], lenToPass);
		case 2225:
			consumer.onChar(2224, arr[2224], lenToPass);
		case 2224:
			consumer.onChar(2223, arr[2223], lenToPass);
		case 2223:
			consumer.onChar(2222, arr[2222], lenToPass);
		case 2222:
			consumer.onChar(2221, arr[2221], lenToPass);
		case 2221:
			consumer.onChar(2220, arr[2220], lenToPass);
		case 2220:
			consumer.onChar(2219, arr[2219], lenToPass);
		case 2219:
			consumer.onChar(2218, arr[2218], lenToPass);
		case 2218:
			consumer.onChar(2217, arr[2217], lenToPass);
		case 2217:
			consumer.onChar(2216, arr[2216], lenToPass);
		case 2216:
			consumer.onChar(2215, arr[2215], lenToPass);
		case 2215:
			consumer.onChar(2214, arr[2214], lenToPass);
		case 2214:
			consumer.onChar(2213, arr[2213], lenToPass);
		case 2213:
			consumer.onChar(2212, arr[2212], lenToPass);
		case 2212:
			consumer.onChar(2211, arr[2211], lenToPass);
		case 2211:
			consumer.onChar(2210, arr[2210], lenToPass);
		case 2210:
			consumer.onChar(2209, arr[2209], lenToPass);
		case 2209:
			consumer.onChar(2208, arr[2208], lenToPass);
		case 2208:
			consumer.onChar(2207, arr[2207], lenToPass);
		case 2207:
			consumer.onChar(2206, arr[2206], lenToPass);
		case 2206:
			consumer.onChar(2205, arr[2205], lenToPass);
		case 2205:
			consumer.onChar(2204, arr[2204], lenToPass);
		case 2204:
			consumer.onChar(2203, arr[2203], lenToPass);
		case 2203:
			consumer.onChar(2202, arr[2202], lenToPass);
		case 2202:
			consumer.onChar(2201, arr[2201], lenToPass);
		case 2201:
			consumer.onChar(2200, arr[2200], lenToPass);
		case 2200:
			consumer.onChar(2199, arr[2199], lenToPass);
		case 2199:
			consumer.onChar(2198, arr[2198], lenToPass);
		case 2198:
			consumer.onChar(2197, arr[2197], lenToPass);
		case 2197:
			consumer.onChar(2196, arr[2196], lenToPass);
		case 2196:
			consumer.onChar(2195, arr[2195], lenToPass);
		case 2195:
			consumer.onChar(2194, arr[2194], lenToPass);
		case 2194:
			consumer.onChar(2193, arr[2193], lenToPass);
		case 2193:
			consumer.onChar(2192, arr[2192], lenToPass);
		case 2192:
			consumer.onChar(2191, arr[2191], lenToPass);
		case 2191:
			consumer.onChar(2190, arr[2190], lenToPass);
		case 2190:
			consumer.onChar(2189, arr[2189], lenToPass);
		case 2189:
			consumer.onChar(2188, arr[2188], lenToPass);
		case 2188:
			consumer.onChar(2187, arr[2187], lenToPass);
		case 2187:
			consumer.onChar(2186, arr[2186], lenToPass);
		case 2186:
			consumer.onChar(2185, arr[2185], lenToPass);
		case 2185:
			consumer.onChar(2184, arr[2184], lenToPass);
		case 2184:
			consumer.onChar(2183, arr[2183], lenToPass);
		case 2183:
			consumer.onChar(2182, arr[2182], lenToPass);
		case 2182:
			consumer.onChar(2181, arr[2181], lenToPass);
		case 2181:
			consumer.onChar(2180, arr[2180], lenToPass);
		case 2180:
			consumer.onChar(2179, arr[2179], lenToPass);
		case 2179:
			consumer.onChar(2178, arr[2178], lenToPass);
		case 2178:
			consumer.onChar(2177, arr[2177], lenToPass);
		case 2177:
			consumer.onChar(2176, arr[2176], lenToPass);
		case 2176:
			consumer.onChar(2175, arr[2175], lenToPass);
		case 2175:
			consumer.onChar(2174, arr[2174], lenToPass);
		case 2174:
			consumer.onChar(2173, arr[2173], lenToPass);
		case 2173:
			consumer.onChar(2172, arr[2172], lenToPass);
		case 2172:
			consumer.onChar(2171, arr[2171], lenToPass);
		case 2171:
			consumer.onChar(2170, arr[2170], lenToPass);
		case 2170:
			consumer.onChar(2169, arr[2169], lenToPass);
		case 2169:
			consumer.onChar(2168, arr[2168], lenToPass);
		case 2168:
			consumer.onChar(2167, arr[2167], lenToPass);
		case 2167:
			consumer.onChar(2166, arr[2166], lenToPass);
		case 2166:
			consumer.onChar(2165, arr[2165], lenToPass);
		case 2165:
			consumer.onChar(2164, arr[2164], lenToPass);
		case 2164:
			consumer.onChar(2163, arr[2163], lenToPass);
		case 2163:
			consumer.onChar(2162, arr[2162], lenToPass);
		case 2162:
			consumer.onChar(2161, arr[2161], lenToPass);
		case 2161:
			consumer.onChar(2160, arr[2160], lenToPass);
		case 2160:
			consumer.onChar(2159, arr[2159], lenToPass);
		case 2159:
			consumer.onChar(2158, arr[2158], lenToPass);
		case 2158:
			consumer.onChar(2157, arr[2157], lenToPass);
		case 2157:
			consumer.onChar(2156, arr[2156], lenToPass);
		case 2156:
			consumer.onChar(2155, arr[2155], lenToPass);
		case 2155:
			consumer.onChar(2154, arr[2154], lenToPass);
		case 2154:
			consumer.onChar(2153, arr[2153], lenToPass);
		case 2153:
			consumer.onChar(2152, arr[2152], lenToPass);
		case 2152:
			consumer.onChar(2151, arr[2151], lenToPass);
		case 2151:
			consumer.onChar(2150, arr[2150], lenToPass);
		case 2150:
			consumer.onChar(2149, arr[2149], lenToPass);
		case 2149:
			consumer.onChar(2148, arr[2148], lenToPass);
		case 2148:
			consumer.onChar(2147, arr[2147], lenToPass);
		case 2147:
			consumer.onChar(2146, arr[2146], lenToPass);
		case 2146:
			consumer.onChar(2145, arr[2145], lenToPass);
		case 2145:
			consumer.onChar(2144, arr[2144], lenToPass);
		case 2144:
			consumer.onChar(2143, arr[2143], lenToPass);
		case 2143:
			consumer.onChar(2142, arr[2142], lenToPass);
		case 2142:
			consumer.onChar(2141, arr[2141], lenToPass);
		case 2141:
			consumer.onChar(2140, arr[2140], lenToPass);
		case 2140:
			consumer.onChar(2139, arr[2139], lenToPass);
		case 2139:
			consumer.onChar(2138, arr[2138], lenToPass);
		case 2138:
			consumer.onChar(2137, arr[2137], lenToPass);
		case 2137:
			consumer.onChar(2136, arr[2136], lenToPass);
		case 2136:
			consumer.onChar(2135, arr[2135], lenToPass);
		case 2135:
			consumer.onChar(2134, arr[2134], lenToPass);
		case 2134:
			consumer.onChar(2133, arr[2133], lenToPass);
		case 2133:
			consumer.onChar(2132, arr[2132], lenToPass);
		case 2132:
			consumer.onChar(2131, arr[2131], lenToPass);
		case 2131:
			consumer.onChar(2130, arr[2130], lenToPass);
		case 2130:
			consumer.onChar(2129, arr[2129], lenToPass);
		case 2129:
			consumer.onChar(2128, arr[2128], lenToPass);
		case 2128:
			consumer.onChar(2127, arr[2127], lenToPass);
		case 2127:
			consumer.onChar(2126, arr[2126], lenToPass);
		case 2126:
			consumer.onChar(2125, arr[2125], lenToPass);
		case 2125:
			consumer.onChar(2124, arr[2124], lenToPass);
		case 2124:
			consumer.onChar(2123, arr[2123], lenToPass);
		case 2123:
			consumer.onChar(2122, arr[2122], lenToPass);
		case 2122:
			consumer.onChar(2121, arr[2121], lenToPass);
		case 2121:
			consumer.onChar(2120, arr[2120], lenToPass);
		case 2120:
			consumer.onChar(2119, arr[2119], lenToPass);
		case 2119:
			consumer.onChar(2118, arr[2118], lenToPass);
		case 2118:
			consumer.onChar(2117, arr[2117], lenToPass);
		case 2117:
			consumer.onChar(2116, arr[2116], lenToPass);
		case 2116:
			consumer.onChar(2115, arr[2115], lenToPass);
		case 2115:
			consumer.onChar(2114, arr[2114], lenToPass);
		case 2114:
			consumer.onChar(2113, arr[2113], lenToPass);
		case 2113:
			consumer.onChar(2112, arr[2112], lenToPass);
		case 2112:
			consumer.onChar(2111, arr[2111], lenToPass);
		case 2111:
			consumer.onChar(2110, arr[2110], lenToPass);
		case 2110:
			consumer.onChar(2109, arr[2109], lenToPass);
		case 2109:
			consumer.onChar(2108, arr[2108], lenToPass);
		case 2108:
			consumer.onChar(2107, arr[2107], lenToPass);
		case 2107:
			consumer.onChar(2106, arr[2106], lenToPass);
		case 2106:
			consumer.onChar(2105, arr[2105], lenToPass);
		case 2105:
			consumer.onChar(2104, arr[2104], lenToPass);
		case 2104:
			consumer.onChar(2103, arr[2103], lenToPass);
		case 2103:
			consumer.onChar(2102, arr[2102], lenToPass);
		case 2102:
			consumer.onChar(2101, arr[2101], lenToPass);
		case 2101:
			consumer.onChar(2100, arr[2100], lenToPass);
		case 2100:
			consumer.onChar(2099, arr[2099], lenToPass);
		case 2099:
			consumer.onChar(2098, arr[2098], lenToPass);
		case 2098:
			consumer.onChar(2097, arr[2097], lenToPass);
		case 2097:
			consumer.onChar(2096, arr[2096], lenToPass);
		case 2096:
			consumer.onChar(2095, arr[2095], lenToPass);
		case 2095:
			consumer.onChar(2094, arr[2094], lenToPass);
		case 2094:
			consumer.onChar(2093, arr[2093], lenToPass);
		case 2093:
			consumer.onChar(2092, arr[2092], lenToPass);
		case 2092:
			consumer.onChar(2091, arr[2091], lenToPass);
		case 2091:
			consumer.onChar(2090, arr[2090], lenToPass);
		case 2090:
			consumer.onChar(2089, arr[2089], lenToPass);
		case 2089:
			consumer.onChar(2088, arr[2088], lenToPass);
		case 2088:
			consumer.onChar(2087, arr[2087], lenToPass);
		case 2087:
			consumer.onChar(2086, arr[2086], lenToPass);
		case 2086:
			consumer.onChar(2085, arr[2085], lenToPass);
		case 2085:
			consumer.onChar(2084, arr[2084], lenToPass);
		case 2084:
			consumer.onChar(2083, arr[2083], lenToPass);
		case 2083:
			consumer.onChar(2082, arr[2082], lenToPass);
		case 2082:
			consumer.onChar(2081, arr[2081], lenToPass);
		case 2081:
			consumer.onChar(2080, arr[2080], lenToPass);
		case 2080:
			consumer.onChar(2079, arr[2079], lenToPass);
		case 2079:
			consumer.onChar(2078, arr[2078], lenToPass);
		case 2078:
			consumer.onChar(2077, arr[2077], lenToPass);
		case 2077:
			consumer.onChar(2076, arr[2076], lenToPass);
		case 2076:
			consumer.onChar(2075, arr[2075], lenToPass);
		case 2075:
			consumer.onChar(2074, arr[2074], lenToPass);
		case 2074:
			consumer.onChar(2073, arr[2073], lenToPass);
		case 2073:
			consumer.onChar(2072, arr[2072], lenToPass);
		case 2072:
			consumer.onChar(2071, arr[2071], lenToPass);
		case 2071:
			consumer.onChar(2070, arr[2070], lenToPass);
		case 2070:
			consumer.onChar(2069, arr[2069], lenToPass);
		case 2069:
			consumer.onChar(2068, arr[2068], lenToPass);
		case 2068:
			consumer.onChar(2067, arr[2067], lenToPass);
		case 2067:
			consumer.onChar(2066, arr[2066], lenToPass);
		case 2066:
			consumer.onChar(2065, arr[2065], lenToPass);
		case 2065:
			consumer.onChar(2064, arr[2064], lenToPass);
		case 2064:
			consumer.onChar(2063, arr[2063], lenToPass);
		case 2063:
			consumer.onChar(2062, arr[2062], lenToPass);
		case 2062:
			consumer.onChar(2061, arr[2061], lenToPass);
		case 2061:
			consumer.onChar(2060, arr[2060], lenToPass);
		case 2060:
			consumer.onChar(2059, arr[2059], lenToPass);
		case 2059:
			consumer.onChar(2058, arr[2058], lenToPass);
		case 2058:
			consumer.onChar(2057, arr[2057], lenToPass);
		case 2057:
			consumer.onChar(2056, arr[2056], lenToPass);
		case 2056:
			consumer.onChar(2055, arr[2055], lenToPass);
		case 2055:
			consumer.onChar(2054, arr[2054], lenToPass);
		case 2054:
			consumer.onChar(2053, arr[2053], lenToPass);
		case 2053:
			consumer.onChar(2052, arr[2052], lenToPass);
		case 2052:
			consumer.onChar(2051, arr[2051], lenToPass);
		case 2051:
			consumer.onChar(2050, arr[2050], lenToPass);
		case 2050:
			consumer.onChar(2049, arr[2049], lenToPass);
		case 2049:
			consumer.onChar(2048, arr[2048], lenToPass);
		case 2048:
			consumer.onChar(2047, arr[2047], lenToPass);
		case 2047:
			consumer.onChar(2046, arr[2046], lenToPass);
		case 2046:
			consumer.onChar(2045, arr[2045], lenToPass);
		case 2045:
			consumer.onChar(2044, arr[2044], lenToPass);
		case 2044:
			consumer.onChar(2043, arr[2043], lenToPass);
		case 2043:
			consumer.onChar(2042, arr[2042], lenToPass);
		case 2042:
			consumer.onChar(2041, arr[2041], lenToPass);
		case 2041:
			consumer.onChar(2040, arr[2040], lenToPass);
		case 2040:
			consumer.onChar(2039, arr[2039], lenToPass);
		case 2039:
			consumer.onChar(2038, arr[2038], lenToPass);
		case 2038:
			consumer.onChar(2037, arr[2037], lenToPass);
		case 2037:
			consumer.onChar(2036, arr[2036], lenToPass);
		case 2036:
			consumer.onChar(2035, arr[2035], lenToPass);
		case 2035:
			consumer.onChar(2034, arr[2034], lenToPass);
		case 2034:
			consumer.onChar(2033, arr[2033], lenToPass);
		case 2033:
			consumer.onChar(2032, arr[2032], lenToPass);
		case 2032:
			consumer.onChar(2031, arr[2031], lenToPass);
		case 2031:
			consumer.onChar(2030, arr[2030], lenToPass);
		case 2030:
			consumer.onChar(2029, arr[2029], lenToPass);
		case 2029:
			consumer.onChar(2028, arr[2028], lenToPass);
		case 2028:
			consumer.onChar(2027, arr[2027], lenToPass);
		case 2027:
			consumer.onChar(2026, arr[2026], lenToPass);
		case 2026:
			consumer.onChar(2025, arr[2025], lenToPass);
		case 2025:
			consumer.onChar(2024, arr[2024], lenToPass);
		case 2024:
			consumer.onChar(2023, arr[2023], lenToPass);
		case 2023:
			consumer.onChar(2022, arr[2022], lenToPass);
		case 2022:
			consumer.onChar(2021, arr[2021], lenToPass);
		case 2021:
			consumer.onChar(2020, arr[2020], lenToPass);
		case 2020:
			consumer.onChar(2019, arr[2019], lenToPass);
		case 2019:
			consumer.onChar(2018, arr[2018], lenToPass);
		case 2018:
			consumer.onChar(2017, arr[2017], lenToPass);
		case 2017:
			consumer.onChar(2016, arr[2016], lenToPass);
		case 2016:
			consumer.onChar(2015, arr[2015], lenToPass);
		case 2015:
			consumer.onChar(2014, arr[2014], lenToPass);
		case 2014:
			consumer.onChar(2013, arr[2013], lenToPass);
		case 2013:
			consumer.onChar(2012, arr[2012], lenToPass);
		case 2012:
			consumer.onChar(2011, arr[2011], lenToPass);
		case 2011:
			consumer.onChar(2010, arr[2010], lenToPass);
		case 2010:
			consumer.onChar(2009, arr[2009], lenToPass);
		case 2009:
			consumer.onChar(2008, arr[2008], lenToPass);
		case 2008:
			consumer.onChar(2007, arr[2007], lenToPass);
		case 2007:
			consumer.onChar(2006, arr[2006], lenToPass);
		case 2006:
			consumer.onChar(2005, arr[2005], lenToPass);
		case 2005:
			consumer.onChar(2004, arr[2004], lenToPass);
		case 2004:
			consumer.onChar(2003, arr[2003], lenToPass);
		case 2003:
			consumer.onChar(2002, arr[2002], lenToPass);
		case 2002:
			consumer.onChar(2001, arr[2001], lenToPass);
		case 2001:
			consumer.onChar(2000, arr[2000], lenToPass);
		case 2000:
			consumer.onChar(1999, arr[1999], lenToPass);
		case 1999:
			consumer.onChar(1998, arr[1998], lenToPass);
		case 1998:
			consumer.onChar(1997, arr[1997], lenToPass);
		case 1997:
			consumer.onChar(1996, arr[1996], lenToPass);
		case 1996:
			consumer.onChar(1995, arr[1995], lenToPass);
		case 1995:
			consumer.onChar(1994, arr[1994], lenToPass);
		case 1994:
			consumer.onChar(1993, arr[1993], lenToPass);
		case 1993:
			consumer.onChar(1992, arr[1992], lenToPass);
		case 1992:
			consumer.onChar(1991, arr[1991], lenToPass);
		case 1991:
			consumer.onChar(1990, arr[1990], lenToPass);
		case 1990:
			consumer.onChar(1989, arr[1989], lenToPass);
		case 1989:
			consumer.onChar(1988, arr[1988], lenToPass);
		case 1988:
			consumer.onChar(1987, arr[1987], lenToPass);
		case 1987:
			consumer.onChar(1986, arr[1986], lenToPass);
		case 1986:
			consumer.onChar(1985, arr[1985], lenToPass);
		case 1985:
			consumer.onChar(1984, arr[1984], lenToPass);
		case 1984:
			consumer.onChar(1983, arr[1983], lenToPass);
		case 1983:
			consumer.onChar(1982, arr[1982], lenToPass);
		case 1982:
			consumer.onChar(1981, arr[1981], lenToPass);
		case 1981:
			consumer.onChar(1980, arr[1980], lenToPass);
		case 1980:
			consumer.onChar(1979, arr[1979], lenToPass);
		case 1979:
			consumer.onChar(1978, arr[1978], lenToPass);
		case 1978:
			consumer.onChar(1977, arr[1977], lenToPass);
		case 1977:
			consumer.onChar(1976, arr[1976], lenToPass);
		case 1976:
			consumer.onChar(1975, arr[1975], lenToPass);
		case 1975:
			consumer.onChar(1974, arr[1974], lenToPass);
		case 1974:
			consumer.onChar(1973, arr[1973], lenToPass);
		case 1973:
			consumer.onChar(1972, arr[1972], lenToPass);
		case 1972:
			consumer.onChar(1971, arr[1971], lenToPass);
		case 1971:
			consumer.onChar(1970, arr[1970], lenToPass);
		case 1970:
			consumer.onChar(1969, arr[1969], lenToPass);
		case 1969:
			consumer.onChar(1968, arr[1968], lenToPass);
		case 1968:
			consumer.onChar(1967, arr[1967], lenToPass);
		case 1967:
			consumer.onChar(1966, arr[1966], lenToPass);
		case 1966:
			consumer.onChar(1965, arr[1965], lenToPass);
		case 1965:
			consumer.onChar(1964, arr[1964], lenToPass);
		case 1964:
			consumer.onChar(1963, arr[1963], lenToPass);
		case 1963:
			consumer.onChar(1962, arr[1962], lenToPass);
		case 1962:
			consumer.onChar(1961, arr[1961], lenToPass);
		case 1961:
			consumer.onChar(1960, arr[1960], lenToPass);
		case 1960:
			consumer.onChar(1959, arr[1959], lenToPass);
		case 1959:
			consumer.onChar(1958, arr[1958], lenToPass);
		case 1958:
			consumer.onChar(1957, arr[1957], lenToPass);
		case 1957:
			consumer.onChar(1956, arr[1956], lenToPass);
		case 1956:
			consumer.onChar(1955, arr[1955], lenToPass);
		case 1955:
			consumer.onChar(1954, arr[1954], lenToPass);
		case 1954:
			consumer.onChar(1953, arr[1953], lenToPass);
		case 1953:
			consumer.onChar(1952, arr[1952], lenToPass);
		case 1952:
			consumer.onChar(1951, arr[1951], lenToPass);
		case 1951:
			consumer.onChar(1950, arr[1950], lenToPass);
		case 1950:
			consumer.onChar(1949, arr[1949], lenToPass);
		case 1949:
			consumer.onChar(1948, arr[1948], lenToPass);
		case 1948:
			consumer.onChar(1947, arr[1947], lenToPass);
		case 1947:
			consumer.onChar(1946, arr[1946], lenToPass);
		case 1946:
			consumer.onChar(1945, arr[1945], lenToPass);
		case 1945:
			consumer.onChar(1944, arr[1944], lenToPass);
		case 1944:
			consumer.onChar(1943, arr[1943], lenToPass);
		case 1943:
			consumer.onChar(1942, arr[1942], lenToPass);
		case 1942:
			consumer.onChar(1941, arr[1941], lenToPass);
		case 1941:
			consumer.onChar(1940, arr[1940], lenToPass);
		case 1940:
			consumer.onChar(1939, arr[1939], lenToPass);
		case 1939:
			consumer.onChar(1938, arr[1938], lenToPass);
		case 1938:
			consumer.onChar(1937, arr[1937], lenToPass);
		case 1937:
			consumer.onChar(1936, arr[1936], lenToPass);
		case 1936:
			consumer.onChar(1935, arr[1935], lenToPass);
		case 1935:
			consumer.onChar(1934, arr[1934], lenToPass);
		case 1934:
			consumer.onChar(1933, arr[1933], lenToPass);
		case 1933:
			consumer.onChar(1932, arr[1932], lenToPass);
		case 1932:
			consumer.onChar(1931, arr[1931], lenToPass);
		case 1931:
			consumer.onChar(1930, arr[1930], lenToPass);
		case 1930:
			consumer.onChar(1929, arr[1929], lenToPass);
		case 1929:
			consumer.onChar(1928, arr[1928], lenToPass);
		case 1928:
			consumer.onChar(1927, arr[1927], lenToPass);
		case 1927:
			consumer.onChar(1926, arr[1926], lenToPass);
		case 1926:
			consumer.onChar(1925, arr[1925], lenToPass);
		case 1925:
			consumer.onChar(1924, arr[1924], lenToPass);
		case 1924:
			consumer.onChar(1923, arr[1923], lenToPass);
		case 1923:
			consumer.onChar(1922, arr[1922], lenToPass);
		case 1922:
			consumer.onChar(1921, arr[1921], lenToPass);
		case 1921:
			consumer.onChar(1920, arr[1920], lenToPass);
		case 1920:
			consumer.onChar(1919, arr[1919], lenToPass);
		case 1919:
			consumer.onChar(1918, arr[1918], lenToPass);
		case 1918:
			consumer.onChar(1917, arr[1917], lenToPass);
		case 1917:
			consumer.onChar(1916, arr[1916], lenToPass);
		case 1916:
			consumer.onChar(1915, arr[1915], lenToPass);
		case 1915:
			consumer.onChar(1914, arr[1914], lenToPass);
		case 1914:
			consumer.onChar(1913, arr[1913], lenToPass);
		case 1913:
			consumer.onChar(1912, arr[1912], lenToPass);
		case 1912:
			consumer.onChar(1911, arr[1911], lenToPass);
		case 1911:
			consumer.onChar(1910, arr[1910], lenToPass);
		case 1910:
			consumer.onChar(1909, arr[1909], lenToPass);
		case 1909:
			consumer.onChar(1908, arr[1908], lenToPass);
		case 1908:
			consumer.onChar(1907, arr[1907], lenToPass);
		case 1907:
			consumer.onChar(1906, arr[1906], lenToPass);
		case 1906:
			consumer.onChar(1905, arr[1905], lenToPass);
		case 1905:
			consumer.onChar(1904, arr[1904], lenToPass);
		case 1904:
			consumer.onChar(1903, arr[1903], lenToPass);
		case 1903:
			consumer.onChar(1902, arr[1902], lenToPass);
		case 1902:
			consumer.onChar(1901, arr[1901], lenToPass);
		case 1901:
			consumer.onChar(1900, arr[1900], lenToPass);
		case 1900:
			consumer.onChar(1899, arr[1899], lenToPass);
		case 1899:
			consumer.onChar(1898, arr[1898], lenToPass);
		case 1898:
			consumer.onChar(1897, arr[1897], lenToPass);
		case 1897:
			consumer.onChar(1896, arr[1896], lenToPass);
		case 1896:
			consumer.onChar(1895, arr[1895], lenToPass);
		case 1895:
			consumer.onChar(1894, arr[1894], lenToPass);
		case 1894:
			consumer.onChar(1893, arr[1893], lenToPass);
		case 1893:
			consumer.onChar(1892, arr[1892], lenToPass);
		case 1892:
			consumer.onChar(1891, arr[1891], lenToPass);
		case 1891:
			consumer.onChar(1890, arr[1890], lenToPass);
		case 1890:
			consumer.onChar(1889, arr[1889], lenToPass);
		case 1889:
			consumer.onChar(1888, arr[1888], lenToPass);
		case 1888:
			consumer.onChar(1887, arr[1887], lenToPass);
		case 1887:
			consumer.onChar(1886, arr[1886], lenToPass);
		case 1886:
			consumer.onChar(1885, arr[1885], lenToPass);
		case 1885:
			consumer.onChar(1884, arr[1884], lenToPass);
		case 1884:
			consumer.onChar(1883, arr[1883], lenToPass);
		case 1883:
			consumer.onChar(1882, arr[1882], lenToPass);
		case 1882:
			consumer.onChar(1881, arr[1881], lenToPass);
		case 1881:
			consumer.onChar(1880, arr[1880], lenToPass);
		case 1880:
			consumer.onChar(1879, arr[1879], lenToPass);
		case 1879:
			consumer.onChar(1878, arr[1878], lenToPass);
		case 1878:
			consumer.onChar(1877, arr[1877], lenToPass);
		case 1877:
			consumer.onChar(1876, arr[1876], lenToPass);
		case 1876:
			consumer.onChar(1875, arr[1875], lenToPass);
		case 1875:
			consumer.onChar(1874, arr[1874], lenToPass);
		case 1874:
			consumer.onChar(1873, arr[1873], lenToPass);
		case 1873:
			consumer.onChar(1872, arr[1872], lenToPass);
		case 1872:
			consumer.onChar(1871, arr[1871], lenToPass);
		case 1871:
			consumer.onChar(1870, arr[1870], lenToPass);
		case 1870:
			consumer.onChar(1869, arr[1869], lenToPass);
		case 1869:
			consumer.onChar(1868, arr[1868], lenToPass);
		case 1868:
			consumer.onChar(1867, arr[1867], lenToPass);
		case 1867:
			consumer.onChar(1866, arr[1866], lenToPass);
		case 1866:
			consumer.onChar(1865, arr[1865], lenToPass);
		case 1865:
			consumer.onChar(1864, arr[1864], lenToPass);
		case 1864:
			consumer.onChar(1863, arr[1863], lenToPass);
		case 1863:
			consumer.onChar(1862, arr[1862], lenToPass);
		case 1862:
			consumer.onChar(1861, arr[1861], lenToPass);
		case 1861:
			consumer.onChar(1860, arr[1860], lenToPass);
		case 1860:
			consumer.onChar(1859, arr[1859], lenToPass);
		case 1859:
			consumer.onChar(1858, arr[1858], lenToPass);
		case 1858:
			consumer.onChar(1857, arr[1857], lenToPass);
		case 1857:
			consumer.onChar(1856, arr[1856], lenToPass);
		case 1856:
			consumer.onChar(1855, arr[1855], lenToPass);
		case 1855:
			consumer.onChar(1854, arr[1854], lenToPass);
		case 1854:
			consumer.onChar(1853, arr[1853], lenToPass);
		case 1853:
			consumer.onChar(1852, arr[1852], lenToPass);
		case 1852:
			consumer.onChar(1851, arr[1851], lenToPass);
		case 1851:
			consumer.onChar(1850, arr[1850], lenToPass);
		case 1850:
			consumer.onChar(1849, arr[1849], lenToPass);
		case 1849:
			consumer.onChar(1848, arr[1848], lenToPass);
		case 1848:
			consumer.onChar(1847, arr[1847], lenToPass);
		case 1847:
			consumer.onChar(1846, arr[1846], lenToPass);
		case 1846:
			consumer.onChar(1845, arr[1845], lenToPass);
		case 1845:
			consumer.onChar(1844, arr[1844], lenToPass);
		case 1844:
			consumer.onChar(1843, arr[1843], lenToPass);
		case 1843:
			consumer.onChar(1842, arr[1842], lenToPass);
		case 1842:
			consumer.onChar(1841, arr[1841], lenToPass);
		case 1841:
			consumer.onChar(1840, arr[1840], lenToPass);
		case 1840:
			consumer.onChar(1839, arr[1839], lenToPass);
		case 1839:
			consumer.onChar(1838, arr[1838], lenToPass);
		case 1838:
			consumer.onChar(1837, arr[1837], lenToPass);
		case 1837:
			consumer.onChar(1836, arr[1836], lenToPass);
		case 1836:
			consumer.onChar(1835, arr[1835], lenToPass);
		case 1835:
			consumer.onChar(1834, arr[1834], lenToPass);
		case 1834:
			consumer.onChar(1833, arr[1833], lenToPass);
		case 1833:
			consumer.onChar(1832, arr[1832], lenToPass);
		case 1832:
			consumer.onChar(1831, arr[1831], lenToPass);
		case 1831:
			consumer.onChar(1830, arr[1830], lenToPass);
		case 1830:
			consumer.onChar(1829, arr[1829], lenToPass);
		case 1829:
			consumer.onChar(1828, arr[1828], lenToPass);
		case 1828:
			consumer.onChar(1827, arr[1827], lenToPass);
		case 1827:
			consumer.onChar(1826, arr[1826], lenToPass);
		case 1826:
			consumer.onChar(1825, arr[1825], lenToPass);
		case 1825:
			consumer.onChar(1824, arr[1824], lenToPass);
		case 1824:
			consumer.onChar(1823, arr[1823], lenToPass);
		case 1823:
			consumer.onChar(1822, arr[1822], lenToPass);
		case 1822:
			consumer.onChar(1821, arr[1821], lenToPass);
		case 1821:
			consumer.onChar(1820, arr[1820], lenToPass);
		case 1820:
			consumer.onChar(1819, arr[1819], lenToPass);
		case 1819:
			consumer.onChar(1818, arr[1818], lenToPass);
		case 1818:
			consumer.onChar(1817, arr[1817], lenToPass);
		case 1817:
			consumer.onChar(1816, arr[1816], lenToPass);
		case 1816:
			consumer.onChar(1815, arr[1815], lenToPass);
		case 1815:
			consumer.onChar(1814, arr[1814], lenToPass);
		case 1814:
			consumer.onChar(1813, arr[1813], lenToPass);
		case 1813:
			consumer.onChar(1812, arr[1812], lenToPass);
		case 1812:
			consumer.onChar(1811, arr[1811], lenToPass);
		case 1811:
			consumer.onChar(1810, arr[1810], lenToPass);
		case 1810:
			consumer.onChar(1809, arr[1809], lenToPass);
		case 1809:
			consumer.onChar(1808, arr[1808], lenToPass);
		case 1808:
			consumer.onChar(1807, arr[1807], lenToPass);
		case 1807:
			consumer.onChar(1806, arr[1806], lenToPass);
		case 1806:
			consumer.onChar(1805, arr[1805], lenToPass);
		case 1805:
			consumer.onChar(1804, arr[1804], lenToPass);
		case 1804:
			consumer.onChar(1803, arr[1803], lenToPass);
		case 1803:
			consumer.onChar(1802, arr[1802], lenToPass);
		case 1802:
			consumer.onChar(1801, arr[1801], lenToPass);
		case 1801:
			consumer.onChar(1800, arr[1800], lenToPass);
		case 1800:
			consumer.onChar(1799, arr[1799], lenToPass);
		case 1799:
			consumer.onChar(1798, arr[1798], lenToPass);
		case 1798:
			consumer.onChar(1797, arr[1797], lenToPass);
		case 1797:
			consumer.onChar(1796, arr[1796], lenToPass);
		case 1796:
			consumer.onChar(1795, arr[1795], lenToPass);
		case 1795:
			consumer.onChar(1794, arr[1794], lenToPass);
		case 1794:
			consumer.onChar(1793, arr[1793], lenToPass);
		case 1793:
			consumer.onChar(1792, arr[1792], lenToPass);
		case 1792:
			consumer.onChar(1791, arr[1791], lenToPass);
		case 1791:
			consumer.onChar(1790, arr[1790], lenToPass);
		case 1790:
			consumer.onChar(1789, arr[1789], lenToPass);
		case 1789:
			consumer.onChar(1788, arr[1788], lenToPass);
		case 1788:
			consumer.onChar(1787, arr[1787], lenToPass);
		case 1787:
			consumer.onChar(1786, arr[1786], lenToPass);
		case 1786:
			consumer.onChar(1785, arr[1785], lenToPass);
		case 1785:
			consumer.onChar(1784, arr[1784], lenToPass);
		case 1784:
			consumer.onChar(1783, arr[1783], lenToPass);
		case 1783:
			consumer.onChar(1782, arr[1782], lenToPass);
		case 1782:
			consumer.onChar(1781, arr[1781], lenToPass);
		case 1781:
			consumer.onChar(1780, arr[1780], lenToPass);
		case 1780:
			consumer.onChar(1779, arr[1779], lenToPass);
		case 1779:
			consumer.onChar(1778, arr[1778], lenToPass);
		case 1778:
			consumer.onChar(1777, arr[1777], lenToPass);
		case 1777:
			consumer.onChar(1776, arr[1776], lenToPass);
		case 1776:
			consumer.onChar(1775, arr[1775], lenToPass);
		case 1775:
			consumer.onChar(1774, arr[1774], lenToPass);
		case 1774:
			consumer.onChar(1773, arr[1773], lenToPass);
		case 1773:
			consumer.onChar(1772, arr[1772], lenToPass);
		case 1772:
			consumer.onChar(1771, arr[1771], lenToPass);
		case 1771:
			consumer.onChar(1770, arr[1770], lenToPass);
		case 1770:
			consumer.onChar(1769, arr[1769], lenToPass);
		case 1769:
			consumer.onChar(1768, arr[1768], lenToPass);
		case 1768:
			consumer.onChar(1767, arr[1767], lenToPass);
		case 1767:
			consumer.onChar(1766, arr[1766], lenToPass);
		case 1766:
			consumer.onChar(1765, arr[1765], lenToPass);
		case 1765:
			consumer.onChar(1764, arr[1764], lenToPass);
		case 1764:
			consumer.onChar(1763, arr[1763], lenToPass);
		case 1763:
			consumer.onChar(1762, arr[1762], lenToPass);
		case 1762:
			consumer.onChar(1761, arr[1761], lenToPass);
		case 1761:
			consumer.onChar(1760, arr[1760], lenToPass);
		case 1760:
			consumer.onChar(1759, arr[1759], lenToPass);
		case 1759:
			consumer.onChar(1758, arr[1758], lenToPass);
		case 1758:
			consumer.onChar(1757, arr[1757], lenToPass);
		case 1757:
			consumer.onChar(1756, arr[1756], lenToPass);
		case 1756:
			consumer.onChar(1755, arr[1755], lenToPass);
		case 1755:
			consumer.onChar(1754, arr[1754], lenToPass);
		case 1754:
			consumer.onChar(1753, arr[1753], lenToPass);
		case 1753:
			consumer.onChar(1752, arr[1752], lenToPass);
		case 1752:
			consumer.onChar(1751, arr[1751], lenToPass);
		case 1751:
			consumer.onChar(1750, arr[1750], lenToPass);
		case 1750:
			consumer.onChar(1749, arr[1749], lenToPass);
		case 1749:
			consumer.onChar(1748, arr[1748], lenToPass);
		case 1748:
			consumer.onChar(1747, arr[1747], lenToPass);
		case 1747:
			consumer.onChar(1746, arr[1746], lenToPass);
		case 1746:
			consumer.onChar(1745, arr[1745], lenToPass);
		case 1745:
			consumer.onChar(1744, arr[1744], lenToPass);
		case 1744:
			consumer.onChar(1743, arr[1743], lenToPass);
		case 1743:
			consumer.onChar(1742, arr[1742], lenToPass);
		case 1742:
			consumer.onChar(1741, arr[1741], lenToPass);
		case 1741:
			consumer.onChar(1740, arr[1740], lenToPass);
		case 1740:
			consumer.onChar(1739, arr[1739], lenToPass);
		case 1739:
			consumer.onChar(1738, arr[1738], lenToPass);
		case 1738:
			consumer.onChar(1737, arr[1737], lenToPass);
		case 1737:
			consumer.onChar(1736, arr[1736], lenToPass);
		case 1736:
			consumer.onChar(1735, arr[1735], lenToPass);
		case 1735:
			consumer.onChar(1734, arr[1734], lenToPass);
		case 1734:
			consumer.onChar(1733, arr[1733], lenToPass);
		case 1733:
			consumer.onChar(1732, arr[1732], lenToPass);
		case 1732:
			consumer.onChar(1731, arr[1731], lenToPass);
		case 1731:
			consumer.onChar(1730, arr[1730], lenToPass);
		case 1730:
			consumer.onChar(1729, arr[1729], lenToPass);
		case 1729:
			consumer.onChar(1728, arr[1728], lenToPass);
		case 1728:
			consumer.onChar(1727, arr[1727], lenToPass);
		case 1727:
			consumer.onChar(1726, arr[1726], lenToPass);
		case 1726:
			consumer.onChar(1725, arr[1725], lenToPass);
		case 1725:
			consumer.onChar(1724, arr[1724], lenToPass);
		case 1724:
			consumer.onChar(1723, arr[1723], lenToPass);
		case 1723:
			consumer.onChar(1722, arr[1722], lenToPass);
		case 1722:
			consumer.onChar(1721, arr[1721], lenToPass);
		case 1721:
			consumer.onChar(1720, arr[1720], lenToPass);
		case 1720:
			consumer.onChar(1719, arr[1719], lenToPass);
		case 1719:
			consumer.onChar(1718, arr[1718], lenToPass);
		case 1718:
			consumer.onChar(1717, arr[1717], lenToPass);
		case 1717:
			consumer.onChar(1716, arr[1716], lenToPass);
		case 1716:
			consumer.onChar(1715, arr[1715], lenToPass);
		case 1715:
			consumer.onChar(1714, arr[1714], lenToPass);
		case 1714:
			consumer.onChar(1713, arr[1713], lenToPass);
		case 1713:
			consumer.onChar(1712, arr[1712], lenToPass);
		case 1712:
			consumer.onChar(1711, arr[1711], lenToPass);
		case 1711:
			consumer.onChar(1710, arr[1710], lenToPass);
		case 1710:
			consumer.onChar(1709, arr[1709], lenToPass);
		case 1709:
			consumer.onChar(1708, arr[1708], lenToPass);
		case 1708:
			consumer.onChar(1707, arr[1707], lenToPass);
		case 1707:
			consumer.onChar(1706, arr[1706], lenToPass);
		case 1706:
			consumer.onChar(1705, arr[1705], lenToPass);
		case 1705:
			consumer.onChar(1704, arr[1704], lenToPass);
		case 1704:
			consumer.onChar(1703, arr[1703], lenToPass);
		case 1703:
			consumer.onChar(1702, arr[1702], lenToPass);
		case 1702:
			consumer.onChar(1701, arr[1701], lenToPass);
		case 1701:
			consumer.onChar(1700, arr[1700], lenToPass);
		case 1700:
			consumer.onChar(1699, arr[1699], lenToPass);
		case 1699:
			consumer.onChar(1698, arr[1698], lenToPass);
		case 1698:
			consumer.onChar(1697, arr[1697], lenToPass);
		case 1697:
			consumer.onChar(1696, arr[1696], lenToPass);
		case 1696:
			consumer.onChar(1695, arr[1695], lenToPass);
		case 1695:
			consumer.onChar(1694, arr[1694], lenToPass);
		case 1694:
			consumer.onChar(1693, arr[1693], lenToPass);
		case 1693:
			consumer.onChar(1692, arr[1692], lenToPass);
		case 1692:
			consumer.onChar(1691, arr[1691], lenToPass);
		case 1691:
			consumer.onChar(1690, arr[1690], lenToPass);
		case 1690:
			consumer.onChar(1689, arr[1689], lenToPass);
		case 1689:
			consumer.onChar(1688, arr[1688], lenToPass);
		case 1688:
			consumer.onChar(1687, arr[1687], lenToPass);
		case 1687:
			consumer.onChar(1686, arr[1686], lenToPass);
		case 1686:
			consumer.onChar(1685, arr[1685], lenToPass);
		case 1685:
			consumer.onChar(1684, arr[1684], lenToPass);
		case 1684:
			consumer.onChar(1683, arr[1683], lenToPass);
		case 1683:
			consumer.onChar(1682, arr[1682], lenToPass);
		case 1682:
			consumer.onChar(1681, arr[1681], lenToPass);
		case 1681:
			consumer.onChar(1680, arr[1680], lenToPass);
		case 1680:
			consumer.onChar(1679, arr[1679], lenToPass);
		case 1679:
			consumer.onChar(1678, arr[1678], lenToPass);
		case 1678:
			consumer.onChar(1677, arr[1677], lenToPass);
		case 1677:
			consumer.onChar(1676, arr[1676], lenToPass);
		case 1676:
			consumer.onChar(1675, arr[1675], lenToPass);
		case 1675:
			consumer.onChar(1674, arr[1674], lenToPass);
		case 1674:
			consumer.onChar(1673, arr[1673], lenToPass);
		case 1673:
			consumer.onChar(1672, arr[1672], lenToPass);
		case 1672:
			consumer.onChar(1671, arr[1671], lenToPass);
		case 1671:
			consumer.onChar(1670, arr[1670], lenToPass);
		case 1670:
			consumer.onChar(1669, arr[1669], lenToPass);
		case 1669:
			consumer.onChar(1668, arr[1668], lenToPass);
		case 1668:
			consumer.onChar(1667, arr[1667], lenToPass);
		case 1667:
			consumer.onChar(1666, arr[1666], lenToPass);
		case 1666:
			consumer.onChar(1665, arr[1665], lenToPass);
		case 1665:
			consumer.onChar(1664, arr[1664], lenToPass);
		case 1664:
			consumer.onChar(1663, arr[1663], lenToPass);
		case 1663:
			consumer.onChar(1662, arr[1662], lenToPass);
		case 1662:
			consumer.onChar(1661, arr[1661], lenToPass);
		case 1661:
			consumer.onChar(1660, arr[1660], lenToPass);
		case 1660:
			consumer.onChar(1659, arr[1659], lenToPass);
		case 1659:
			consumer.onChar(1658, arr[1658], lenToPass);
		case 1658:
			consumer.onChar(1657, arr[1657], lenToPass);
		case 1657:
			consumer.onChar(1656, arr[1656], lenToPass);
		case 1656:
			consumer.onChar(1655, arr[1655], lenToPass);
		case 1655:
			consumer.onChar(1654, arr[1654], lenToPass);
		case 1654:
			consumer.onChar(1653, arr[1653], lenToPass);
		case 1653:
			consumer.onChar(1652, arr[1652], lenToPass);
		case 1652:
			consumer.onChar(1651, arr[1651], lenToPass);
		case 1651:
			consumer.onChar(1650, arr[1650], lenToPass);
		case 1650:
			consumer.onChar(1649, arr[1649], lenToPass);
		case 1649:
			consumer.onChar(1648, arr[1648], lenToPass);
		case 1648:
			consumer.onChar(1647, arr[1647], lenToPass);
		case 1647:
			consumer.onChar(1646, arr[1646], lenToPass);
		case 1646:
			consumer.onChar(1645, arr[1645], lenToPass);
		case 1645:
			consumer.onChar(1644, arr[1644], lenToPass);
		case 1644:
			consumer.onChar(1643, arr[1643], lenToPass);
		case 1643:
			consumer.onChar(1642, arr[1642], lenToPass);
		case 1642:
			consumer.onChar(1641, arr[1641], lenToPass);
		case 1641:
			consumer.onChar(1640, arr[1640], lenToPass);
		case 1640:
			consumer.onChar(1639, arr[1639], lenToPass);
		case 1639:
			consumer.onChar(1638, arr[1638], lenToPass);
		case 1638:
			consumer.onChar(1637, arr[1637], lenToPass);
		case 1637:
			consumer.onChar(1636, arr[1636], lenToPass);
		case 1636:
			consumer.onChar(1635, arr[1635], lenToPass);
		case 1635:
			consumer.onChar(1634, arr[1634], lenToPass);
		case 1634:
			consumer.onChar(1633, arr[1633], lenToPass);
		case 1633:
			consumer.onChar(1632, arr[1632], lenToPass);
		case 1632:
			consumer.onChar(1631, arr[1631], lenToPass);
		case 1631:
			consumer.onChar(1630, arr[1630], lenToPass);
		case 1630:
			consumer.onChar(1629, arr[1629], lenToPass);
		case 1629:
			consumer.onChar(1628, arr[1628], lenToPass);
		case 1628:
			consumer.onChar(1627, arr[1627], lenToPass);
		case 1627:
			consumer.onChar(1626, arr[1626], lenToPass);
		case 1626:
			consumer.onChar(1625, arr[1625], lenToPass);
		case 1625:
			consumer.onChar(1624, arr[1624], lenToPass);
		case 1624:
			consumer.onChar(1623, arr[1623], lenToPass);
		case 1623:
			consumer.onChar(1622, arr[1622], lenToPass);
		case 1622:
			consumer.onChar(1621, arr[1621], lenToPass);
		case 1621:
			consumer.onChar(1620, arr[1620], lenToPass);
		case 1620:
			consumer.onChar(1619, arr[1619], lenToPass);
		case 1619:
			consumer.onChar(1618, arr[1618], lenToPass);
		case 1618:
			consumer.onChar(1617, arr[1617], lenToPass);
		case 1617:
			consumer.onChar(1616, arr[1616], lenToPass);
		case 1616:
			consumer.onChar(1615, arr[1615], lenToPass);
		case 1615:
			consumer.onChar(1614, arr[1614], lenToPass);
		case 1614:
			consumer.onChar(1613, arr[1613], lenToPass);
		case 1613:
			consumer.onChar(1612, arr[1612], lenToPass);
		case 1612:
			consumer.onChar(1611, arr[1611], lenToPass);
		case 1611:
			consumer.onChar(1610, arr[1610], lenToPass);
		case 1610:
			consumer.onChar(1609, arr[1609], lenToPass);
		case 1609:
			consumer.onChar(1608, arr[1608], lenToPass);
		case 1608:
			consumer.onChar(1607, arr[1607], lenToPass);
		case 1607:
			consumer.onChar(1606, arr[1606], lenToPass);
		case 1606:
			consumer.onChar(1605, arr[1605], lenToPass);
		case 1605:
			consumer.onChar(1604, arr[1604], lenToPass);
		case 1604:
			consumer.onChar(1603, arr[1603], lenToPass);
		case 1603:
			consumer.onChar(1602, arr[1602], lenToPass);
		case 1602:
			consumer.onChar(1601, arr[1601], lenToPass);
		case 1601:
			consumer.onChar(1600, arr[1600], lenToPass);
		case 1600:
			consumer.onChar(1599, arr[1599], lenToPass);
		case 1599:
			consumer.onChar(1598, arr[1598], lenToPass);
		case 1598:
			consumer.onChar(1597, arr[1597], lenToPass);
		case 1597:
			consumer.onChar(1596, arr[1596], lenToPass);
		case 1596:
			consumer.onChar(1595, arr[1595], lenToPass);
		case 1595:
			consumer.onChar(1594, arr[1594], lenToPass);
		case 1594:
			consumer.onChar(1593, arr[1593], lenToPass);
		case 1593:
			consumer.onChar(1592, arr[1592], lenToPass);
		case 1592:
			consumer.onChar(1591, arr[1591], lenToPass);
		case 1591:
			consumer.onChar(1590, arr[1590], lenToPass);
		case 1590:
			consumer.onChar(1589, arr[1589], lenToPass);
		case 1589:
			consumer.onChar(1588, arr[1588], lenToPass);
		case 1588:
			consumer.onChar(1587, arr[1587], lenToPass);
		case 1587:
			consumer.onChar(1586, arr[1586], lenToPass);
		case 1586:
			consumer.onChar(1585, arr[1585], lenToPass);
		case 1585:
			consumer.onChar(1584, arr[1584], lenToPass);
		case 1584:
			consumer.onChar(1583, arr[1583], lenToPass);
		case 1583:
			consumer.onChar(1582, arr[1582], lenToPass);
		case 1582:
			consumer.onChar(1581, arr[1581], lenToPass);
		case 1581:
			consumer.onChar(1580, arr[1580], lenToPass);
		case 1580:
			consumer.onChar(1579, arr[1579], lenToPass);
		case 1579:
			consumer.onChar(1578, arr[1578], lenToPass);
		case 1578:
			consumer.onChar(1577, arr[1577], lenToPass);
		case 1577:
			consumer.onChar(1576, arr[1576], lenToPass);
		case 1576:
			consumer.onChar(1575, arr[1575], lenToPass);
		case 1575:
			consumer.onChar(1574, arr[1574], lenToPass);
		case 1574:
			consumer.onChar(1573, arr[1573], lenToPass);
		case 1573:
			consumer.onChar(1572, arr[1572], lenToPass);
		case 1572:
			consumer.onChar(1571, arr[1571], lenToPass);
		case 1571:
			consumer.onChar(1570, arr[1570], lenToPass);
		case 1570:
			consumer.onChar(1569, arr[1569], lenToPass);
		case 1569:
			consumer.onChar(1568, arr[1568], lenToPass);
		case 1568:
			consumer.onChar(1567, arr[1567], lenToPass);
		case 1567:
			consumer.onChar(1566, arr[1566], lenToPass);
		case 1566:
			consumer.onChar(1565, arr[1565], lenToPass);
		case 1565:
			consumer.onChar(1564, arr[1564], lenToPass);
		case 1564:
			consumer.onChar(1563, arr[1563], lenToPass);
		case 1563:
			consumer.onChar(1562, arr[1562], lenToPass);
		case 1562:
			consumer.onChar(1561, arr[1561], lenToPass);
		case 1561:
			consumer.onChar(1560, arr[1560], lenToPass);
		case 1560:
			consumer.onChar(1559, arr[1559], lenToPass);
		case 1559:
			consumer.onChar(1558, arr[1558], lenToPass);
		case 1558:
			consumer.onChar(1557, arr[1557], lenToPass);
		case 1557:
			consumer.onChar(1556, arr[1556], lenToPass);
		case 1556:
			consumer.onChar(1555, arr[1555], lenToPass);
		case 1555:
			consumer.onChar(1554, arr[1554], lenToPass);
		case 1554:
			consumer.onChar(1553, arr[1553], lenToPass);
		case 1553:
			consumer.onChar(1552, arr[1552], lenToPass);
		case 1552:
			consumer.onChar(1551, arr[1551], lenToPass);
		case 1551:
			consumer.onChar(1550, arr[1550], lenToPass);
		case 1550:
			consumer.onChar(1549, arr[1549], lenToPass);
		case 1549:
			consumer.onChar(1548, arr[1548], lenToPass);
		case 1548:
			consumer.onChar(1547, arr[1547], lenToPass);
		case 1547:
			consumer.onChar(1546, arr[1546], lenToPass);
		case 1546:
			consumer.onChar(1545, arr[1545], lenToPass);
		case 1545:
			consumer.onChar(1544, arr[1544], lenToPass);
		case 1544:
			consumer.onChar(1543, arr[1543], lenToPass);
		case 1543:
			consumer.onChar(1542, arr[1542], lenToPass);
		case 1542:
			consumer.onChar(1541, arr[1541], lenToPass);
		case 1541:
			consumer.onChar(1540, arr[1540], lenToPass);
		case 1540:
			consumer.onChar(1539, arr[1539], lenToPass);
		case 1539:
			consumer.onChar(1538, arr[1538], lenToPass);
		case 1538:
			consumer.onChar(1537, arr[1537], lenToPass);
		case 1537:
			consumer.onChar(1536, arr[1536], lenToPass);
		case 1536:
			consumer.onChar(1535, arr[1535], lenToPass);
		case 1535:
			consumer.onChar(1534, arr[1534], lenToPass);
		case 1534:
			consumer.onChar(1533, arr[1533], lenToPass);
		case 1533:
			consumer.onChar(1532, arr[1532], lenToPass);
		case 1532:
			consumer.onChar(1531, arr[1531], lenToPass);
		case 1531:
			consumer.onChar(1530, arr[1530], lenToPass);
		case 1530:
			consumer.onChar(1529, arr[1529], lenToPass);
		case 1529:
			consumer.onChar(1528, arr[1528], lenToPass);
		case 1528:
			consumer.onChar(1527, arr[1527], lenToPass);
		case 1527:
			consumer.onChar(1526, arr[1526], lenToPass);
		case 1526:
			consumer.onChar(1525, arr[1525], lenToPass);
		case 1525:
			consumer.onChar(1524, arr[1524], lenToPass);
		case 1524:
			consumer.onChar(1523, arr[1523], lenToPass);
		case 1523:
			consumer.onChar(1522, arr[1522], lenToPass);
		case 1522:
			consumer.onChar(1521, arr[1521], lenToPass);
		case 1521:
			consumer.onChar(1520, arr[1520], lenToPass);
		case 1520:
			consumer.onChar(1519, arr[1519], lenToPass);
		case 1519:
			consumer.onChar(1518, arr[1518], lenToPass);
		case 1518:
			consumer.onChar(1517, arr[1517], lenToPass);
		case 1517:
			consumer.onChar(1516, arr[1516], lenToPass);
		case 1516:
			consumer.onChar(1515, arr[1515], lenToPass);
		case 1515:
			consumer.onChar(1514, arr[1514], lenToPass);
		case 1514:
			consumer.onChar(1513, arr[1513], lenToPass);
		case 1513:
			consumer.onChar(1512, arr[1512], lenToPass);
		case 1512:
			consumer.onChar(1511, arr[1511], lenToPass);
		case 1511:
			consumer.onChar(1510, arr[1510], lenToPass);
		case 1510:
			consumer.onChar(1509, arr[1509], lenToPass);
		case 1509:
			consumer.onChar(1508, arr[1508], lenToPass);
		case 1508:
			consumer.onChar(1507, arr[1507], lenToPass);
		case 1507:
			consumer.onChar(1506, arr[1506], lenToPass);
		case 1506:
			consumer.onChar(1505, arr[1505], lenToPass);
		case 1505:
			consumer.onChar(1504, arr[1504], lenToPass);
		case 1504:
			consumer.onChar(1503, arr[1503], lenToPass);
		case 1503:
			consumer.onChar(1502, arr[1502], lenToPass);
		case 1502:
			consumer.onChar(1501, arr[1501], lenToPass);
		case 1501:
			consumer.onChar(1500, arr[1500], lenToPass);
		case 1500:
			consumer.onChar(1499, arr[1499], lenToPass);
		case 1499:
			consumer.onChar(1498, arr[1498], lenToPass);
		case 1498:
			consumer.onChar(1497, arr[1497], lenToPass);
		case 1497:
			consumer.onChar(1496, arr[1496], lenToPass);
		case 1496:
			consumer.onChar(1495, arr[1495], lenToPass);
		case 1495:
			consumer.onChar(1494, arr[1494], lenToPass);
		case 1494:
			consumer.onChar(1493, arr[1493], lenToPass);
		case 1493:
			consumer.onChar(1492, arr[1492], lenToPass);
		case 1492:
			consumer.onChar(1491, arr[1491], lenToPass);
		case 1491:
			consumer.onChar(1490, arr[1490], lenToPass);
		case 1490:
			consumer.onChar(1489, arr[1489], lenToPass);
		case 1489:
			consumer.onChar(1488, arr[1488], lenToPass);
		case 1488:
			consumer.onChar(1487, arr[1487], lenToPass);
		case 1487:
			consumer.onChar(1486, arr[1486], lenToPass);
		case 1486:
			consumer.onChar(1485, arr[1485], lenToPass);
		case 1485:
			consumer.onChar(1484, arr[1484], lenToPass);
		case 1484:
			consumer.onChar(1483, arr[1483], lenToPass);
		case 1483:
			consumer.onChar(1482, arr[1482], lenToPass);
		case 1482:
			consumer.onChar(1481, arr[1481], lenToPass);
		case 1481:
			consumer.onChar(1480, arr[1480], lenToPass);
		case 1480:
			consumer.onChar(1479, arr[1479], lenToPass);
		case 1479:
			consumer.onChar(1478, arr[1478], lenToPass);
		case 1478:
			consumer.onChar(1477, arr[1477], lenToPass);
		case 1477:
			consumer.onChar(1476, arr[1476], lenToPass);
		case 1476:
			consumer.onChar(1475, arr[1475], lenToPass);
		case 1475:
			consumer.onChar(1474, arr[1474], lenToPass);
		case 1474:
			consumer.onChar(1473, arr[1473], lenToPass);
		case 1473:
			consumer.onChar(1472, arr[1472], lenToPass);
		case 1472:
			consumer.onChar(1471, arr[1471], lenToPass);
		case 1471:
			consumer.onChar(1470, arr[1470], lenToPass);
		case 1470:
			consumer.onChar(1469, arr[1469], lenToPass);
		case 1469:
			consumer.onChar(1468, arr[1468], lenToPass);
		case 1468:
			consumer.onChar(1467, arr[1467], lenToPass);
		case 1467:
			consumer.onChar(1466, arr[1466], lenToPass);
		case 1466:
			consumer.onChar(1465, arr[1465], lenToPass);
		case 1465:
			consumer.onChar(1464, arr[1464], lenToPass);
		case 1464:
			consumer.onChar(1463, arr[1463], lenToPass);
		case 1463:
			consumer.onChar(1462, arr[1462], lenToPass);
		case 1462:
			consumer.onChar(1461, arr[1461], lenToPass);
		case 1461:
			consumer.onChar(1460, arr[1460], lenToPass);
		case 1460:
			consumer.onChar(1459, arr[1459], lenToPass);
		case 1459:
			consumer.onChar(1458, arr[1458], lenToPass);
		case 1458:
			consumer.onChar(1457, arr[1457], lenToPass);
		case 1457:
			consumer.onChar(1456, arr[1456], lenToPass);
		case 1456:
			consumer.onChar(1455, arr[1455], lenToPass);
		case 1455:
			consumer.onChar(1454, arr[1454], lenToPass);
		case 1454:
			consumer.onChar(1453, arr[1453], lenToPass);
		case 1453:
			consumer.onChar(1452, arr[1452], lenToPass);
		case 1452:
			consumer.onChar(1451, arr[1451], lenToPass);
		case 1451:
			consumer.onChar(1450, arr[1450], lenToPass);
		case 1450:
			consumer.onChar(1449, arr[1449], lenToPass);
		case 1449:
			consumer.onChar(1448, arr[1448], lenToPass);
		case 1448:
			consumer.onChar(1447, arr[1447], lenToPass);
		case 1447:
			consumer.onChar(1446, arr[1446], lenToPass);
		case 1446:
			consumer.onChar(1445, arr[1445], lenToPass);
		case 1445:
			consumer.onChar(1444, arr[1444], lenToPass);
		case 1444:
			consumer.onChar(1443, arr[1443], lenToPass);
		case 1443:
			consumer.onChar(1442, arr[1442], lenToPass);
		case 1442:
			consumer.onChar(1441, arr[1441], lenToPass);
		case 1441:
			consumer.onChar(1440, arr[1440], lenToPass);
		case 1440:
			consumer.onChar(1439, arr[1439], lenToPass);
		case 1439:
			consumer.onChar(1438, arr[1438], lenToPass);
		case 1438:
			consumer.onChar(1437, arr[1437], lenToPass);
		case 1437:
			consumer.onChar(1436, arr[1436], lenToPass);
		case 1436:
			consumer.onChar(1435, arr[1435], lenToPass);
		case 1435:
			consumer.onChar(1434, arr[1434], lenToPass);
		case 1434:
			consumer.onChar(1433, arr[1433], lenToPass);
		case 1433:
			consumer.onChar(1432, arr[1432], lenToPass);
		case 1432:
			consumer.onChar(1431, arr[1431], lenToPass);
		case 1431:
			consumer.onChar(1430, arr[1430], lenToPass);
		case 1430:
			consumer.onChar(1429, arr[1429], lenToPass);
		case 1429:
			consumer.onChar(1428, arr[1428], lenToPass);
		case 1428:
			consumer.onChar(1427, arr[1427], lenToPass);
		case 1427:
			consumer.onChar(1426, arr[1426], lenToPass);
		case 1426:
			consumer.onChar(1425, arr[1425], lenToPass);
		case 1425:
			consumer.onChar(1424, arr[1424], lenToPass);
		case 1424:
			consumer.onChar(1423, arr[1423], lenToPass);
		case 1423:
			consumer.onChar(1422, arr[1422], lenToPass);
		case 1422:
			consumer.onChar(1421, arr[1421], lenToPass);
		case 1421:
			consumer.onChar(1420, arr[1420], lenToPass);
		case 1420:
			consumer.onChar(1419, arr[1419], lenToPass);
		case 1419:
			consumer.onChar(1418, arr[1418], lenToPass);
		case 1418:
			consumer.onChar(1417, arr[1417], lenToPass);
		case 1417:
			consumer.onChar(1416, arr[1416], lenToPass);
		case 1416:
			consumer.onChar(1415, arr[1415], lenToPass);
		case 1415:
			consumer.onChar(1414, arr[1414], lenToPass);
		case 1414:
			consumer.onChar(1413, arr[1413], lenToPass);
		case 1413:
			consumer.onChar(1412, arr[1412], lenToPass);
		case 1412:
			consumer.onChar(1411, arr[1411], lenToPass);
		case 1411:
			consumer.onChar(1410, arr[1410], lenToPass);
		case 1410:
			consumer.onChar(1409, arr[1409], lenToPass);
		case 1409:
			consumer.onChar(1408, arr[1408], lenToPass);
		case 1408:
			consumer.onChar(1407, arr[1407], lenToPass);
		case 1407:
			consumer.onChar(1406, arr[1406], lenToPass);
		case 1406:
			consumer.onChar(1405, arr[1405], lenToPass);
		case 1405:
			consumer.onChar(1404, arr[1404], lenToPass);
		case 1404:
			consumer.onChar(1403, arr[1403], lenToPass);
		case 1403:
			consumer.onChar(1402, arr[1402], lenToPass);
		case 1402:
			consumer.onChar(1401, arr[1401], lenToPass);
		case 1401:
			consumer.onChar(1400, arr[1400], lenToPass);
		case 1400:
			consumer.onChar(1399, arr[1399], lenToPass);
		case 1399:
			consumer.onChar(1398, arr[1398], lenToPass);
		case 1398:
			consumer.onChar(1397, arr[1397], lenToPass);
		case 1397:
			consumer.onChar(1396, arr[1396], lenToPass);
		case 1396:
			consumer.onChar(1395, arr[1395], lenToPass);
		case 1395:
			consumer.onChar(1394, arr[1394], lenToPass);
		case 1394:
			consumer.onChar(1393, arr[1393], lenToPass);
		case 1393:
			consumer.onChar(1392, arr[1392], lenToPass);
		case 1392:
			consumer.onChar(1391, arr[1391], lenToPass);
		case 1391:
			consumer.onChar(1390, arr[1390], lenToPass);
		case 1390:
			consumer.onChar(1389, arr[1389], lenToPass);
		case 1389:
			consumer.onChar(1388, arr[1388], lenToPass);
		case 1388:
			consumer.onChar(1387, arr[1387], lenToPass);
		case 1387:
			consumer.onChar(1386, arr[1386], lenToPass);
		case 1386:
			consumer.onChar(1385, arr[1385], lenToPass);
		case 1385:
			consumer.onChar(1384, arr[1384], lenToPass);
		case 1384:
			consumer.onChar(1383, arr[1383], lenToPass);
		case 1383:
			consumer.onChar(1382, arr[1382], lenToPass);
		case 1382:
			consumer.onChar(1381, arr[1381], lenToPass);
		case 1381:
			consumer.onChar(1380, arr[1380], lenToPass);
		case 1380:
			consumer.onChar(1379, arr[1379], lenToPass);
		case 1379:
			consumer.onChar(1378, arr[1378], lenToPass);
		case 1378:
			consumer.onChar(1377, arr[1377], lenToPass);
		case 1377:
			consumer.onChar(1376, arr[1376], lenToPass);
		case 1376:
			consumer.onChar(1375, arr[1375], lenToPass);
		case 1375:
			consumer.onChar(1374, arr[1374], lenToPass);
		case 1374:
			consumer.onChar(1373, arr[1373], lenToPass);
		case 1373:
			consumer.onChar(1372, arr[1372], lenToPass);
		case 1372:
			consumer.onChar(1371, arr[1371], lenToPass);
		case 1371:
			consumer.onChar(1370, arr[1370], lenToPass);
		case 1370:
			consumer.onChar(1369, arr[1369], lenToPass);
		case 1369:
			consumer.onChar(1368, arr[1368], lenToPass);
		case 1368:
			consumer.onChar(1367, arr[1367], lenToPass);
		case 1367:
			consumer.onChar(1366, arr[1366], lenToPass);
		case 1366:
			consumer.onChar(1365, arr[1365], lenToPass);
		case 1365:
			consumer.onChar(1364, arr[1364], lenToPass);
		case 1364:
			consumer.onChar(1363, arr[1363], lenToPass);
		case 1363:
			consumer.onChar(1362, arr[1362], lenToPass);
		case 1362:
			consumer.onChar(1361, arr[1361], lenToPass);
		case 1361:
			consumer.onChar(1360, arr[1360], lenToPass);
		case 1360:
			consumer.onChar(1359, arr[1359], lenToPass);
		case 1359:
			consumer.onChar(1358, arr[1358], lenToPass);
		case 1358:
			consumer.onChar(1357, arr[1357], lenToPass);
		case 1357:
			consumer.onChar(1356, arr[1356], lenToPass);
		case 1356:
			consumer.onChar(1355, arr[1355], lenToPass);
		case 1355:
			consumer.onChar(1354, arr[1354], lenToPass);
		case 1354:
			consumer.onChar(1353, arr[1353], lenToPass);
		case 1353:
			consumer.onChar(1352, arr[1352], lenToPass);
		case 1352:
			consumer.onChar(1351, arr[1351], lenToPass);
		case 1351:
			consumer.onChar(1350, arr[1350], lenToPass);
		case 1350:
			consumer.onChar(1349, arr[1349], lenToPass);
		case 1349:
			consumer.onChar(1348, arr[1348], lenToPass);
		case 1348:
			consumer.onChar(1347, arr[1347], lenToPass);
		case 1347:
			consumer.onChar(1346, arr[1346], lenToPass);
		case 1346:
			consumer.onChar(1345, arr[1345], lenToPass);
		case 1345:
			consumer.onChar(1344, arr[1344], lenToPass);
		case 1344:
			consumer.onChar(1343, arr[1343], lenToPass);
		case 1343:
			consumer.onChar(1342, arr[1342], lenToPass);
		case 1342:
			consumer.onChar(1341, arr[1341], lenToPass);
		case 1341:
			consumer.onChar(1340, arr[1340], lenToPass);
		case 1340:
			consumer.onChar(1339, arr[1339], lenToPass);
		case 1339:
			consumer.onChar(1338, arr[1338], lenToPass);
		case 1338:
			consumer.onChar(1337, arr[1337], lenToPass);
		case 1337:
			consumer.onChar(1336, arr[1336], lenToPass);
		case 1336:
			consumer.onChar(1335, arr[1335], lenToPass);
		case 1335:
			consumer.onChar(1334, arr[1334], lenToPass);
		case 1334:
			consumer.onChar(1333, arr[1333], lenToPass);
		case 1333:
			consumer.onChar(1332, arr[1332], lenToPass);
		case 1332:
			consumer.onChar(1331, arr[1331], lenToPass);
		case 1331:
			consumer.onChar(1330, arr[1330], lenToPass);
		case 1330:
			consumer.onChar(1329, arr[1329], lenToPass);
		case 1329:
			consumer.onChar(1328, arr[1328], lenToPass);
		case 1328:
			consumer.onChar(1327, arr[1327], lenToPass);
		case 1327:
			consumer.onChar(1326, arr[1326], lenToPass);
		case 1326:
			consumer.onChar(1325, arr[1325], lenToPass);
		case 1325:
			consumer.onChar(1324, arr[1324], lenToPass);
		case 1324:
			consumer.onChar(1323, arr[1323], lenToPass);
		case 1323:
			consumer.onChar(1322, arr[1322], lenToPass);
		case 1322:
			consumer.onChar(1321, arr[1321], lenToPass);
		case 1321:
			consumer.onChar(1320, arr[1320], lenToPass);
		case 1320:
			consumer.onChar(1319, arr[1319], lenToPass);
		case 1319:
			consumer.onChar(1318, arr[1318], lenToPass);
		case 1318:
			consumer.onChar(1317, arr[1317], lenToPass);
		case 1317:
			consumer.onChar(1316, arr[1316], lenToPass);
		case 1316:
			consumer.onChar(1315, arr[1315], lenToPass);
		case 1315:
			consumer.onChar(1314, arr[1314], lenToPass);
		case 1314:
			consumer.onChar(1313, arr[1313], lenToPass);
		case 1313:
			consumer.onChar(1312, arr[1312], lenToPass);
		case 1312:
			consumer.onChar(1311, arr[1311], lenToPass);
		case 1311:
			consumer.onChar(1310, arr[1310], lenToPass);
		case 1310:
			consumer.onChar(1309, arr[1309], lenToPass);
		case 1309:
			consumer.onChar(1308, arr[1308], lenToPass);
		case 1308:
			consumer.onChar(1307, arr[1307], lenToPass);
		case 1307:
			consumer.onChar(1306, arr[1306], lenToPass);
		case 1306:
			consumer.onChar(1305, arr[1305], lenToPass);
		case 1305:
			consumer.onChar(1304, arr[1304], lenToPass);
		case 1304:
			consumer.onChar(1303, arr[1303], lenToPass);
		case 1303:
			consumer.onChar(1302, arr[1302], lenToPass);
		case 1302:
			consumer.onChar(1301, arr[1301], lenToPass);
		case 1301:
			consumer.onChar(1300, arr[1300], lenToPass);
		case 1300:
			consumer.onChar(1299, arr[1299], lenToPass);
		case 1299:
			consumer.onChar(1298, arr[1298], lenToPass);
		case 1298:
			consumer.onChar(1297, arr[1297], lenToPass);
		case 1297:
			consumer.onChar(1296, arr[1296], lenToPass);
		case 1296:
			consumer.onChar(1295, arr[1295], lenToPass);
		case 1295:
			consumer.onChar(1294, arr[1294], lenToPass);
		case 1294:
			consumer.onChar(1293, arr[1293], lenToPass);
		case 1293:
			consumer.onChar(1292, arr[1292], lenToPass);
		case 1292:
			consumer.onChar(1291, arr[1291], lenToPass);
		case 1291:
			consumer.onChar(1290, arr[1290], lenToPass);
		case 1290:
			consumer.onChar(1289, arr[1289], lenToPass);
		case 1289:
			consumer.onChar(1288, arr[1288], lenToPass);
		case 1288:
			consumer.onChar(1287, arr[1287], lenToPass);
		case 1287:
			consumer.onChar(1286, arr[1286], lenToPass);
		case 1286:
			consumer.onChar(1285, arr[1285], lenToPass);
		case 1285:
			consumer.onChar(1284, arr[1284], lenToPass);
		case 1284:
			consumer.onChar(1283, arr[1283], lenToPass);
		case 1283:
			consumer.onChar(1282, arr[1282], lenToPass);
		case 1282:
			consumer.onChar(1281, arr[1281], lenToPass);
		case 1281:
			consumer.onChar(1280, arr[1280], lenToPass);
		case 1280:
			consumer.onChar(1279, arr[1279], lenToPass);
		case 1279:
			consumer.onChar(1278, arr[1278], lenToPass);
		case 1278:
			consumer.onChar(1277, arr[1277], lenToPass);
		case 1277:
			consumer.onChar(1276, arr[1276], lenToPass);
		case 1276:
			consumer.onChar(1275, arr[1275], lenToPass);
		case 1275:
			consumer.onChar(1274, arr[1274], lenToPass);
		case 1274:
			consumer.onChar(1273, arr[1273], lenToPass);
		case 1273:
			consumer.onChar(1272, arr[1272], lenToPass);
		case 1272:
			consumer.onChar(1271, arr[1271], lenToPass);
		case 1271:
			consumer.onChar(1270, arr[1270], lenToPass);
		case 1270:
			consumer.onChar(1269, arr[1269], lenToPass);
		case 1269:
			consumer.onChar(1268, arr[1268], lenToPass);
		case 1268:
			consumer.onChar(1267, arr[1267], lenToPass);
		case 1267:
			consumer.onChar(1266, arr[1266], lenToPass);
		case 1266:
			consumer.onChar(1265, arr[1265], lenToPass);
		case 1265:
			consumer.onChar(1264, arr[1264], lenToPass);
		case 1264:
			consumer.onChar(1263, arr[1263], lenToPass);
		case 1263:
			consumer.onChar(1262, arr[1262], lenToPass);
		case 1262:
			consumer.onChar(1261, arr[1261], lenToPass);
		case 1261:
			consumer.onChar(1260, arr[1260], lenToPass);
		case 1260:
			consumer.onChar(1259, arr[1259], lenToPass);
		case 1259:
			consumer.onChar(1258, arr[1258], lenToPass);
		case 1258:
			consumer.onChar(1257, arr[1257], lenToPass);
		case 1257:
			consumer.onChar(1256, arr[1256], lenToPass);
		case 1256:
			consumer.onChar(1255, arr[1255], lenToPass);
		case 1255:
			consumer.onChar(1254, arr[1254], lenToPass);
		case 1254:
			consumer.onChar(1253, arr[1253], lenToPass);
		case 1253:
			consumer.onChar(1252, arr[1252], lenToPass);
		case 1252:
			consumer.onChar(1251, arr[1251], lenToPass);
		case 1251:
			consumer.onChar(1250, arr[1250], lenToPass);
		case 1250:
			consumer.onChar(1249, arr[1249], lenToPass);
		case 1249:
			consumer.onChar(1248, arr[1248], lenToPass);
		case 1248:
			consumer.onChar(1247, arr[1247], lenToPass);
		case 1247:
			consumer.onChar(1246, arr[1246], lenToPass);
		case 1246:
			consumer.onChar(1245, arr[1245], lenToPass);
		case 1245:
			consumer.onChar(1244, arr[1244], lenToPass);
		case 1244:
			consumer.onChar(1243, arr[1243], lenToPass);
		case 1243:
			consumer.onChar(1242, arr[1242], lenToPass);
		case 1242:
			consumer.onChar(1241, arr[1241], lenToPass);
		case 1241:
			consumer.onChar(1240, arr[1240], lenToPass);
		case 1240:
			consumer.onChar(1239, arr[1239], lenToPass);
		case 1239:
			consumer.onChar(1238, arr[1238], lenToPass);
		case 1238:
			consumer.onChar(1237, arr[1237], lenToPass);
		case 1237:
			consumer.onChar(1236, arr[1236], lenToPass);
		case 1236:
			consumer.onChar(1235, arr[1235], lenToPass);
		case 1235:
			consumer.onChar(1234, arr[1234], lenToPass);
		case 1234:
			consumer.onChar(1233, arr[1233], lenToPass);
		case 1233:
			consumer.onChar(1232, arr[1232], lenToPass);
		case 1232:
			consumer.onChar(1231, arr[1231], lenToPass);
		case 1231:
			consumer.onChar(1230, arr[1230], lenToPass);
		case 1230:
			consumer.onChar(1229, arr[1229], lenToPass);
		case 1229:
			consumer.onChar(1228, arr[1228], lenToPass);
		case 1228:
			consumer.onChar(1227, arr[1227], lenToPass);
		case 1227:
			consumer.onChar(1226, arr[1226], lenToPass);
		case 1226:
			consumer.onChar(1225, arr[1225], lenToPass);
		case 1225:
			consumer.onChar(1224, arr[1224], lenToPass);
		case 1224:
			consumer.onChar(1223, arr[1223], lenToPass);
		case 1223:
			consumer.onChar(1222, arr[1222], lenToPass);
		case 1222:
			consumer.onChar(1221, arr[1221], lenToPass);
		case 1221:
			consumer.onChar(1220, arr[1220], lenToPass);
		case 1220:
			consumer.onChar(1219, arr[1219], lenToPass);
		case 1219:
			consumer.onChar(1218, arr[1218], lenToPass);
		case 1218:
			consumer.onChar(1217, arr[1217], lenToPass);
		case 1217:
			consumer.onChar(1216, arr[1216], lenToPass);
		case 1216:
			consumer.onChar(1215, arr[1215], lenToPass);
		case 1215:
			consumer.onChar(1214, arr[1214], lenToPass);
		case 1214:
			consumer.onChar(1213, arr[1213], lenToPass);
		case 1213:
			consumer.onChar(1212, arr[1212], lenToPass);
		case 1212:
			consumer.onChar(1211, arr[1211], lenToPass);
		case 1211:
			consumer.onChar(1210, arr[1210], lenToPass);
		case 1210:
			consumer.onChar(1209, arr[1209], lenToPass);
		case 1209:
			consumer.onChar(1208, arr[1208], lenToPass);
		case 1208:
			consumer.onChar(1207, arr[1207], lenToPass);
		case 1207:
			consumer.onChar(1206, arr[1206], lenToPass);
		case 1206:
			consumer.onChar(1205, arr[1205], lenToPass);
		case 1205:
			consumer.onChar(1204, arr[1204], lenToPass);
		case 1204:
			consumer.onChar(1203, arr[1203], lenToPass);
		case 1203:
			consumer.onChar(1202, arr[1202], lenToPass);
		case 1202:
			consumer.onChar(1201, arr[1201], lenToPass);
		case 1201:
			consumer.onChar(1200, arr[1200], lenToPass);
		case 1200:
			consumer.onChar(1199, arr[1199], lenToPass);
		case 1199:
			consumer.onChar(1198, arr[1198], lenToPass);
		case 1198:
			consumer.onChar(1197, arr[1197], lenToPass);
		case 1197:
			consumer.onChar(1196, arr[1196], lenToPass);
		case 1196:
			consumer.onChar(1195, arr[1195], lenToPass);
		case 1195:
			consumer.onChar(1194, arr[1194], lenToPass);
		case 1194:
			consumer.onChar(1193, arr[1193], lenToPass);
		case 1193:
			consumer.onChar(1192, arr[1192], lenToPass);
		case 1192:
			consumer.onChar(1191, arr[1191], lenToPass);
		case 1191:
			consumer.onChar(1190, arr[1190], lenToPass);
		case 1190:
			consumer.onChar(1189, arr[1189], lenToPass);
		case 1189:
			consumer.onChar(1188, arr[1188], lenToPass);
		case 1188:
			consumer.onChar(1187, arr[1187], lenToPass);
		case 1187:
			consumer.onChar(1186, arr[1186], lenToPass);
		case 1186:
			consumer.onChar(1185, arr[1185], lenToPass);
		case 1185:
			consumer.onChar(1184, arr[1184], lenToPass);
		case 1184:
			consumer.onChar(1183, arr[1183], lenToPass);
		case 1183:
			consumer.onChar(1182, arr[1182], lenToPass);
		case 1182:
			consumer.onChar(1181, arr[1181], lenToPass);
		case 1181:
			consumer.onChar(1180, arr[1180], lenToPass);
		case 1180:
			consumer.onChar(1179, arr[1179], lenToPass);
		case 1179:
			consumer.onChar(1178, arr[1178], lenToPass);
		case 1178:
			consumer.onChar(1177, arr[1177], lenToPass);
		case 1177:
			consumer.onChar(1176, arr[1176], lenToPass);
		case 1176:
			consumer.onChar(1175, arr[1175], lenToPass);
		case 1175:
			consumer.onChar(1174, arr[1174], lenToPass);
		case 1174:
			consumer.onChar(1173, arr[1173], lenToPass);
		case 1173:
			consumer.onChar(1172, arr[1172], lenToPass);
		case 1172:
			consumer.onChar(1171, arr[1171], lenToPass);
		case 1171:
			consumer.onChar(1170, arr[1170], lenToPass);
		case 1170:
			consumer.onChar(1169, arr[1169], lenToPass);
		case 1169:
			consumer.onChar(1168, arr[1168], lenToPass);
		case 1168:
			consumer.onChar(1167, arr[1167], lenToPass);
		case 1167:
			consumer.onChar(1166, arr[1166], lenToPass);
		case 1166:
			consumer.onChar(1165, arr[1165], lenToPass);
		case 1165:
			consumer.onChar(1164, arr[1164], lenToPass);
		case 1164:
			consumer.onChar(1163, arr[1163], lenToPass);
		case 1163:
			consumer.onChar(1162, arr[1162], lenToPass);
		case 1162:
			consumer.onChar(1161, arr[1161], lenToPass);
		case 1161:
			consumer.onChar(1160, arr[1160], lenToPass);
		case 1160:
			consumer.onChar(1159, arr[1159], lenToPass);
		case 1159:
			consumer.onChar(1158, arr[1158], lenToPass);
		case 1158:
			consumer.onChar(1157, arr[1157], lenToPass);
		case 1157:
			consumer.onChar(1156, arr[1156], lenToPass);
		case 1156:
			consumer.onChar(1155, arr[1155], lenToPass);
		case 1155:
			consumer.onChar(1154, arr[1154], lenToPass);
		case 1154:
			consumer.onChar(1153, arr[1153], lenToPass);
		case 1153:
			consumer.onChar(1152, arr[1152], lenToPass);
		case 1152:
			consumer.onChar(1151, arr[1151], lenToPass);
		case 1151:
			consumer.onChar(1150, arr[1150], lenToPass);
		case 1150:
			consumer.onChar(1149, arr[1149], lenToPass);
		case 1149:
			consumer.onChar(1148, arr[1148], lenToPass);
		case 1148:
			consumer.onChar(1147, arr[1147], lenToPass);
		case 1147:
			consumer.onChar(1146, arr[1146], lenToPass);
		case 1146:
			consumer.onChar(1145, arr[1145], lenToPass);
		case 1145:
			consumer.onChar(1144, arr[1144], lenToPass);
		case 1144:
			consumer.onChar(1143, arr[1143], lenToPass);
		case 1143:
			consumer.onChar(1142, arr[1142], lenToPass);
		case 1142:
			consumer.onChar(1141, arr[1141], lenToPass);
		case 1141:
			consumer.onChar(1140, arr[1140], lenToPass);
		case 1140:
			consumer.onChar(1139, arr[1139], lenToPass);
		case 1139:
			consumer.onChar(1138, arr[1138], lenToPass);
		case 1138:
			consumer.onChar(1137, arr[1137], lenToPass);
		case 1137:
			consumer.onChar(1136, arr[1136], lenToPass);
		case 1136:
			consumer.onChar(1135, arr[1135], lenToPass);
		case 1135:
			consumer.onChar(1134, arr[1134], lenToPass);
		case 1134:
			consumer.onChar(1133, arr[1133], lenToPass);
		case 1133:
			consumer.onChar(1132, arr[1132], lenToPass);
		case 1132:
			consumer.onChar(1131, arr[1131], lenToPass);
		case 1131:
			consumer.onChar(1130, arr[1130], lenToPass);
		case 1130:
			consumer.onChar(1129, arr[1129], lenToPass);
		case 1129:
			consumer.onChar(1128, arr[1128], lenToPass);
		case 1128:
			consumer.onChar(1127, arr[1127], lenToPass);
		case 1127:
			consumer.onChar(1126, arr[1126], lenToPass);
		case 1126:
			consumer.onChar(1125, arr[1125], lenToPass);
		case 1125:
			consumer.onChar(1124, arr[1124], lenToPass);
		case 1124:
			consumer.onChar(1123, arr[1123], lenToPass);
		case 1123:
			consumer.onChar(1122, arr[1122], lenToPass);
		case 1122:
			consumer.onChar(1121, arr[1121], lenToPass);
		case 1121:
			consumer.onChar(1120, arr[1120], lenToPass);
		case 1120:
			consumer.onChar(1119, arr[1119], lenToPass);
		case 1119:
			consumer.onChar(1118, arr[1118], lenToPass);
		case 1118:
			consumer.onChar(1117, arr[1117], lenToPass);
		case 1117:
			consumer.onChar(1116, arr[1116], lenToPass);
		case 1116:
			consumer.onChar(1115, arr[1115], lenToPass);
		case 1115:
			consumer.onChar(1114, arr[1114], lenToPass);
		case 1114:
			consumer.onChar(1113, arr[1113], lenToPass);
		case 1113:
			consumer.onChar(1112, arr[1112], lenToPass);
		case 1112:
			consumer.onChar(1111, arr[1111], lenToPass);
		case 1111:
			consumer.onChar(1110, arr[1110], lenToPass);
		case 1110:
			consumer.onChar(1109, arr[1109], lenToPass);
		case 1109:
			consumer.onChar(1108, arr[1108], lenToPass);
		case 1108:
			consumer.onChar(1107, arr[1107], lenToPass);
		case 1107:
			consumer.onChar(1106, arr[1106], lenToPass);
		case 1106:
			consumer.onChar(1105, arr[1105], lenToPass);
		case 1105:
			consumer.onChar(1104, arr[1104], lenToPass);
		case 1104:
			consumer.onChar(1103, arr[1103], lenToPass);
		case 1103:
			consumer.onChar(1102, arr[1102], lenToPass);
		case 1102:
			consumer.onChar(1101, arr[1101], lenToPass);
		case 1101:
			consumer.onChar(1100, arr[1100], lenToPass);
		case 1100:
			consumer.onChar(1099, arr[1099], lenToPass);
		case 1099:
			consumer.onChar(1098, arr[1098], lenToPass);
		case 1098:
			consumer.onChar(1097, arr[1097], lenToPass);
		case 1097:
			consumer.onChar(1096, arr[1096], lenToPass);
		case 1096:
			consumer.onChar(1095, arr[1095], lenToPass);
		case 1095:
			consumer.onChar(1094, arr[1094], lenToPass);
		case 1094:
			consumer.onChar(1093, arr[1093], lenToPass);
		case 1093:
			consumer.onChar(1092, arr[1092], lenToPass);
		case 1092:
			consumer.onChar(1091, arr[1091], lenToPass);
		case 1091:
			consumer.onChar(1090, arr[1090], lenToPass);
		case 1090:
			consumer.onChar(1089, arr[1089], lenToPass);
		case 1089:
			consumer.onChar(1088, arr[1088], lenToPass);
		case 1088:
			consumer.onChar(1087, arr[1087], lenToPass);
		case 1087:
			consumer.onChar(1086, arr[1086], lenToPass);
		case 1086:
			consumer.onChar(1085, arr[1085], lenToPass);
		case 1085:
			consumer.onChar(1084, arr[1084], lenToPass);
		case 1084:
			consumer.onChar(1083, arr[1083], lenToPass);
		case 1083:
			consumer.onChar(1082, arr[1082], lenToPass);
		case 1082:
			consumer.onChar(1081, arr[1081], lenToPass);
		case 1081:
			consumer.onChar(1080, arr[1080], lenToPass);
		case 1080:
			consumer.onChar(1079, arr[1079], lenToPass);
		case 1079:
			consumer.onChar(1078, arr[1078], lenToPass);
		case 1078:
			consumer.onChar(1077, arr[1077], lenToPass);
		case 1077:
			consumer.onChar(1076, arr[1076], lenToPass);
		case 1076:
			consumer.onChar(1075, arr[1075], lenToPass);
		case 1075:
			consumer.onChar(1074, arr[1074], lenToPass);
		case 1074:
			consumer.onChar(1073, arr[1073], lenToPass);
		case 1073:
			consumer.onChar(1072, arr[1072], lenToPass);
		case 1072:
			consumer.onChar(1071, arr[1071], lenToPass);
		case 1071:
			consumer.onChar(1070, arr[1070], lenToPass);
		case 1070:
			consumer.onChar(1069, arr[1069], lenToPass);
		case 1069:
			consumer.onChar(1068, arr[1068], lenToPass);
		case 1068:
			consumer.onChar(1067, arr[1067], lenToPass);
		case 1067:
			consumer.onChar(1066, arr[1066], lenToPass);
		case 1066:
			consumer.onChar(1065, arr[1065], lenToPass);
		case 1065:
			consumer.onChar(1064, arr[1064], lenToPass);
		case 1064:
			consumer.onChar(1063, arr[1063], lenToPass);
		case 1063:
			consumer.onChar(1062, arr[1062], lenToPass);
		case 1062:
			consumer.onChar(1061, arr[1061], lenToPass);
		case 1061:
			consumer.onChar(1060, arr[1060], lenToPass);
		case 1060:
			consumer.onChar(1059, arr[1059], lenToPass);
		case 1059:
			consumer.onChar(1058, arr[1058], lenToPass);
		case 1058:
			consumer.onChar(1057, arr[1057], lenToPass);
		case 1057:
			consumer.onChar(1056, arr[1056], lenToPass);
		case 1056:
			consumer.onChar(1055, arr[1055], lenToPass);
		case 1055:
			consumer.onChar(1054, arr[1054], lenToPass);
		case 1054:
			consumer.onChar(1053, arr[1053], lenToPass);
		case 1053:
			consumer.onChar(1052, arr[1052], lenToPass);
		case 1052:
			consumer.onChar(1051, arr[1051], lenToPass);
		case 1051:
			consumer.onChar(1050, arr[1050], lenToPass);
		case 1050:
			consumer.onChar(1049, arr[1049], lenToPass);
		case 1049:
			consumer.onChar(1048, arr[1048], lenToPass);
		case 1048:
			consumer.onChar(1047, arr[1047], lenToPass);
		case 1047:
			consumer.onChar(1046, arr[1046], lenToPass);
		case 1046:
			consumer.onChar(1045, arr[1045], lenToPass);
		case 1045:
			consumer.onChar(1044, arr[1044], lenToPass);
		case 1044:
			consumer.onChar(1043, arr[1043], lenToPass);
		case 1043:
			consumer.onChar(1042, arr[1042], lenToPass);
		case 1042:
			consumer.onChar(1041, arr[1041], lenToPass);
		case 1041:
			consumer.onChar(1040, arr[1040], lenToPass);
		case 1040:
			consumer.onChar(1039, arr[1039], lenToPass);
		case 1039:
			consumer.onChar(1038, arr[1038], lenToPass);
		case 1038:
			consumer.onChar(1037, arr[1037], lenToPass);
		case 1037:
			consumer.onChar(1036, arr[1036], lenToPass);
		case 1036:
			consumer.onChar(1035, arr[1035], lenToPass);
		case 1035:
			consumer.onChar(1034, arr[1034], lenToPass);
		case 1034:
			consumer.onChar(1033, arr[1033], lenToPass);
		case 1033:
			consumer.onChar(1032, arr[1032], lenToPass);
		case 1032:
			consumer.onChar(1031, arr[1031], lenToPass);
		case 1031:
			consumer.onChar(1030, arr[1030], lenToPass);
		case 1030:
			consumer.onChar(1029, arr[1029], lenToPass);
		case 1029:
			consumer.onChar(1028, arr[1028], lenToPass);
		case 1028:
			consumer.onChar(1027, arr[1027], lenToPass);
		case 1027:
			consumer.onChar(1026, arr[1026], lenToPass);
		case 1026:
			consumer.onChar(1025, arr[1025], lenToPass);
		case 1025:
			consumer.onChar(1024, arr[1024], lenToPass);
		case 1024:
			consumer.onChar(1023, arr[1023], lenToPass);
		case 1023:
			consumer.onChar(1022, arr[1022], lenToPass);
		case 1022:
			consumer.onChar(1021, arr[1021], lenToPass);
		case 1021:
			consumer.onChar(1020, arr[1020], lenToPass);
		case 1020:
			consumer.onChar(1019, arr[1019], lenToPass);
		case 1019:
			consumer.onChar(1018, arr[1018], lenToPass);
		case 1018:
			consumer.onChar(1017, arr[1017], lenToPass);
		case 1017:
			consumer.onChar(1016, arr[1016], lenToPass);
		case 1016:
			consumer.onChar(1015, arr[1015], lenToPass);
		case 1015:
			consumer.onChar(1014, arr[1014], lenToPass);
		case 1014:
			consumer.onChar(1013, arr[1013], lenToPass);
		case 1013:
			consumer.onChar(1012, arr[1012], lenToPass);
		case 1012:
			consumer.onChar(1011, arr[1011], lenToPass);
		case 1011:
			consumer.onChar(1010, arr[1010], lenToPass);
		case 1010:
			consumer.onChar(1009, arr[1009], lenToPass);
		case 1009:
			consumer.onChar(1008, arr[1008], lenToPass);
		case 1008:
			consumer.onChar(1007, arr[1007], lenToPass);
		case 1007:
			consumer.onChar(1006, arr[1006], lenToPass);
		case 1006:
			consumer.onChar(1005, arr[1005], lenToPass);
		case 1005:
			consumer.onChar(1004, arr[1004], lenToPass);
		case 1004:
			consumer.onChar(1003, arr[1003], lenToPass);
		case 1003:
			consumer.onChar(1002, arr[1002], lenToPass);
		case 1002:
			consumer.onChar(1001, arr[1001], lenToPass);
		case 1001:
			consumer.onChar(1000, arr[1000], lenToPass);
		case 1000:
			consumer.onChar(999, arr[999], lenToPass);
		case 999:
			consumer.onChar(998, arr[998], lenToPass);
		case 998:
			consumer.onChar(997, arr[997], lenToPass);
		case 997:
			consumer.onChar(996, arr[996], lenToPass);
		case 996:
			consumer.onChar(995, arr[995], lenToPass);
		case 995:
			consumer.onChar(994, arr[994], lenToPass);
		case 994:
			consumer.onChar(993, arr[993], lenToPass);
		case 993:
			consumer.onChar(992, arr[992], lenToPass);
		case 992:
			consumer.onChar(991, arr[991], lenToPass);
		case 991:
			consumer.onChar(990, arr[990], lenToPass);
		case 990:
			consumer.onChar(989, arr[989], lenToPass);
		case 989:
			consumer.onChar(988, arr[988], lenToPass);
		case 988:
			consumer.onChar(987, arr[987], lenToPass);
		case 987:
			consumer.onChar(986, arr[986], lenToPass);
		case 986:
			consumer.onChar(985, arr[985], lenToPass);
		case 985:
			consumer.onChar(984, arr[984], lenToPass);
		case 984:
			consumer.onChar(983, arr[983], lenToPass);
		case 983:
			consumer.onChar(982, arr[982], lenToPass);
		case 982:
			consumer.onChar(981, arr[981], lenToPass);
		case 981:
			consumer.onChar(980, arr[980], lenToPass);
		case 980:
			consumer.onChar(979, arr[979], lenToPass);
		case 979:
			consumer.onChar(978, arr[978], lenToPass);
		case 978:
			consumer.onChar(977, arr[977], lenToPass);
		case 977:
			consumer.onChar(976, arr[976], lenToPass);
		case 976:
			consumer.onChar(975, arr[975], lenToPass);
		case 975:
			consumer.onChar(974, arr[974], lenToPass);
		case 974:
			consumer.onChar(973, arr[973], lenToPass);
		case 973:
			consumer.onChar(972, arr[972], lenToPass);
		case 972:
			consumer.onChar(971, arr[971], lenToPass);
		case 971:
			consumer.onChar(970, arr[970], lenToPass);
		case 970:
			consumer.onChar(969, arr[969], lenToPass);
		case 969:
			consumer.onChar(968, arr[968], lenToPass);
		case 968:
			consumer.onChar(967, arr[967], lenToPass);
		case 967:
			consumer.onChar(966, arr[966], lenToPass);
		case 966:
			consumer.onChar(965, arr[965], lenToPass);
		case 965:
			consumer.onChar(964, arr[964], lenToPass);
		case 964:
			consumer.onChar(963, arr[963], lenToPass);
		case 963:
			consumer.onChar(962, arr[962], lenToPass);
		case 962:
			consumer.onChar(961, arr[961], lenToPass);
		case 961:
			consumer.onChar(960, arr[960], lenToPass);
		case 960:
			consumer.onChar(959, arr[959], lenToPass);
		case 959:
			consumer.onChar(958, arr[958], lenToPass);
		case 958:
			consumer.onChar(957, arr[957], lenToPass);
		case 957:
			consumer.onChar(956, arr[956], lenToPass);
		case 956:
			consumer.onChar(955, arr[955], lenToPass);
		case 955:
			consumer.onChar(954, arr[954], lenToPass);
		case 954:
			consumer.onChar(953, arr[953], lenToPass);
		case 953:
			consumer.onChar(952, arr[952], lenToPass);
		case 952:
			consumer.onChar(951, arr[951], lenToPass);
		case 951:
			consumer.onChar(950, arr[950], lenToPass);
		case 950:
			consumer.onChar(949, arr[949], lenToPass);
		case 949:
			consumer.onChar(948, arr[948], lenToPass);
		case 948:
			consumer.onChar(947, arr[947], lenToPass);
		case 947:
			consumer.onChar(946, arr[946], lenToPass);
		case 946:
			consumer.onChar(945, arr[945], lenToPass);
		case 945:
			consumer.onChar(944, arr[944], lenToPass);
		case 944:
			consumer.onChar(943, arr[943], lenToPass);
		case 943:
			consumer.onChar(942, arr[942], lenToPass);
		case 942:
			consumer.onChar(941, arr[941], lenToPass);
		case 941:
			consumer.onChar(940, arr[940], lenToPass);
		case 940:
			consumer.onChar(939, arr[939], lenToPass);
		case 939:
			consumer.onChar(938, arr[938], lenToPass);
		case 938:
			consumer.onChar(937, arr[937], lenToPass);
		case 937:
			consumer.onChar(936, arr[936], lenToPass);
		case 936:
			consumer.onChar(935, arr[935], lenToPass);
		case 935:
			consumer.onChar(934, arr[934], lenToPass);
		case 934:
			consumer.onChar(933, arr[933], lenToPass);
		case 933:
			consumer.onChar(932, arr[932], lenToPass);
		case 932:
			consumer.onChar(931, arr[931], lenToPass);
		case 931:
			consumer.onChar(930, arr[930], lenToPass);
		case 930:
			consumer.onChar(929, arr[929], lenToPass);
		case 929:
			consumer.onChar(928, arr[928], lenToPass);
		case 928:
			consumer.onChar(927, arr[927], lenToPass);
		case 927:
			consumer.onChar(926, arr[926], lenToPass);
		case 926:
			consumer.onChar(925, arr[925], lenToPass);
		case 925:
			consumer.onChar(924, arr[924], lenToPass);
		case 924:
			consumer.onChar(923, arr[923], lenToPass);
		case 923:
			consumer.onChar(922, arr[922], lenToPass);
		case 922:
			consumer.onChar(921, arr[921], lenToPass);
		case 921:
			consumer.onChar(920, arr[920], lenToPass);
		case 920:
			consumer.onChar(919, arr[919], lenToPass);
		case 919:
			consumer.onChar(918, arr[918], lenToPass);
		case 918:
			consumer.onChar(917, arr[917], lenToPass);
		case 917:
			consumer.onChar(916, arr[916], lenToPass);
		case 916:
			consumer.onChar(915, arr[915], lenToPass);
		case 915:
			consumer.onChar(914, arr[914], lenToPass);
		case 914:
			consumer.onChar(913, arr[913], lenToPass);
		case 913:
			consumer.onChar(912, arr[912], lenToPass);
		case 912:
			consumer.onChar(911, arr[911], lenToPass);
		case 911:
			consumer.onChar(910, arr[910], lenToPass);
		case 910:
			consumer.onChar(909, arr[909], lenToPass);
		case 909:
			consumer.onChar(908, arr[908], lenToPass);
		case 908:
			consumer.onChar(907, arr[907], lenToPass);
		case 907:
			consumer.onChar(906, arr[906], lenToPass);
		case 906:
			consumer.onChar(905, arr[905], lenToPass);
		case 905:
			consumer.onChar(904, arr[904], lenToPass);
		case 904:
			consumer.onChar(903, arr[903], lenToPass);
		case 903:
			consumer.onChar(902, arr[902], lenToPass);
		case 902:
			consumer.onChar(901, arr[901], lenToPass);
		case 901:
			consumer.onChar(900, arr[900], lenToPass);
		case 900:
			consumer.onChar(899, arr[899], lenToPass);
		case 899:
			consumer.onChar(898, arr[898], lenToPass);
		case 898:
			consumer.onChar(897, arr[897], lenToPass);
		case 897:
			consumer.onChar(896, arr[896], lenToPass);
		case 896:
			consumer.onChar(895, arr[895], lenToPass);
		case 895:
			consumer.onChar(894, arr[894], lenToPass);
		case 894:
			consumer.onChar(893, arr[893], lenToPass);
		case 893:
			consumer.onChar(892, arr[892], lenToPass);
		case 892:
			consumer.onChar(891, arr[891], lenToPass);
		case 891:
			consumer.onChar(890, arr[890], lenToPass);
		case 890:
			consumer.onChar(889, arr[889], lenToPass);
		case 889:
			consumer.onChar(888, arr[888], lenToPass);
		case 888:
			consumer.onChar(887, arr[887], lenToPass);
		case 887:
			consumer.onChar(886, arr[886], lenToPass);
		case 886:
			consumer.onChar(885, arr[885], lenToPass);
		case 885:
			consumer.onChar(884, arr[884], lenToPass);
		case 884:
			consumer.onChar(883, arr[883], lenToPass);
		case 883:
			consumer.onChar(882, arr[882], lenToPass);
		case 882:
			consumer.onChar(881, arr[881], lenToPass);
		case 881:
			consumer.onChar(880, arr[880], lenToPass);
		case 880:
			consumer.onChar(879, arr[879], lenToPass);
		case 879:
			consumer.onChar(878, arr[878], lenToPass);
		case 878:
			consumer.onChar(877, arr[877], lenToPass);
		case 877:
			consumer.onChar(876, arr[876], lenToPass);
		case 876:
			consumer.onChar(875, arr[875], lenToPass);
		case 875:
			consumer.onChar(874, arr[874], lenToPass);
		case 874:
			consumer.onChar(873, arr[873], lenToPass);
		case 873:
			consumer.onChar(872, arr[872], lenToPass);
		case 872:
			consumer.onChar(871, arr[871], lenToPass);
		case 871:
			consumer.onChar(870, arr[870], lenToPass);
		case 870:
			consumer.onChar(869, arr[869], lenToPass);
		case 869:
			consumer.onChar(868, arr[868], lenToPass);
		case 868:
			consumer.onChar(867, arr[867], lenToPass);
		case 867:
			consumer.onChar(866, arr[866], lenToPass);
		case 866:
			consumer.onChar(865, arr[865], lenToPass);
		case 865:
			consumer.onChar(864, arr[864], lenToPass);
		case 864:
			consumer.onChar(863, arr[863], lenToPass);
		case 863:
			consumer.onChar(862, arr[862], lenToPass);
		case 862:
			consumer.onChar(861, arr[861], lenToPass);
		case 861:
			consumer.onChar(860, arr[860], lenToPass);
		case 860:
			consumer.onChar(859, arr[859], lenToPass);
		case 859:
			consumer.onChar(858, arr[858], lenToPass);
		case 858:
			consumer.onChar(857, arr[857], lenToPass);
		case 857:
			consumer.onChar(856, arr[856], lenToPass);
		case 856:
			consumer.onChar(855, arr[855], lenToPass);
		case 855:
			consumer.onChar(854, arr[854], lenToPass);
		case 854:
			consumer.onChar(853, arr[853], lenToPass);
		case 853:
			consumer.onChar(852, arr[852], lenToPass);
		case 852:
			consumer.onChar(851, arr[851], lenToPass);
		case 851:
			consumer.onChar(850, arr[850], lenToPass);
		case 850:
			consumer.onChar(849, arr[849], lenToPass);
		case 849:
			consumer.onChar(848, arr[848], lenToPass);
		case 848:
			consumer.onChar(847, arr[847], lenToPass);
		case 847:
			consumer.onChar(846, arr[846], lenToPass);
		case 846:
			consumer.onChar(845, arr[845], lenToPass);
		case 845:
			consumer.onChar(844, arr[844], lenToPass);
		case 844:
			consumer.onChar(843, arr[843], lenToPass);
		case 843:
			consumer.onChar(842, arr[842], lenToPass);
		case 842:
			consumer.onChar(841, arr[841], lenToPass);
		case 841:
			consumer.onChar(840, arr[840], lenToPass);
		case 840:
			consumer.onChar(839, arr[839], lenToPass);
		case 839:
			consumer.onChar(838, arr[838], lenToPass);
		case 838:
			consumer.onChar(837, arr[837], lenToPass);
		case 837:
			consumer.onChar(836, arr[836], lenToPass);
		case 836:
			consumer.onChar(835, arr[835], lenToPass);
		case 835:
			consumer.onChar(834, arr[834], lenToPass);
		case 834:
			consumer.onChar(833, arr[833], lenToPass);
		case 833:
			consumer.onChar(832, arr[832], lenToPass);
		case 832:
			consumer.onChar(831, arr[831], lenToPass);
		case 831:
			consumer.onChar(830, arr[830], lenToPass);
		case 830:
			consumer.onChar(829, arr[829], lenToPass);
		case 829:
			consumer.onChar(828, arr[828], lenToPass);
		case 828:
			consumer.onChar(827, arr[827], lenToPass);
		case 827:
			consumer.onChar(826, arr[826], lenToPass);
		case 826:
			consumer.onChar(825, arr[825], lenToPass);
		case 825:
			consumer.onChar(824, arr[824], lenToPass);
		case 824:
			consumer.onChar(823, arr[823], lenToPass);
		case 823:
			consumer.onChar(822, arr[822], lenToPass);
		case 822:
			consumer.onChar(821, arr[821], lenToPass);
		case 821:
			consumer.onChar(820, arr[820], lenToPass);
		case 820:
			consumer.onChar(819, arr[819], lenToPass);
		case 819:
			consumer.onChar(818, arr[818], lenToPass);
		case 818:
			consumer.onChar(817, arr[817], lenToPass);
		case 817:
			consumer.onChar(816, arr[816], lenToPass);
		case 816:
			consumer.onChar(815, arr[815], lenToPass);
		case 815:
			consumer.onChar(814, arr[814], lenToPass);
		case 814:
			consumer.onChar(813, arr[813], lenToPass);
		case 813:
			consumer.onChar(812, arr[812], lenToPass);
		case 812:
			consumer.onChar(811, arr[811], lenToPass);
		case 811:
			consumer.onChar(810, arr[810], lenToPass);
		case 810:
			consumer.onChar(809, arr[809], lenToPass);
		case 809:
			consumer.onChar(808, arr[808], lenToPass);
		case 808:
			consumer.onChar(807, arr[807], lenToPass);
		case 807:
			consumer.onChar(806, arr[806], lenToPass);
		case 806:
			consumer.onChar(805, arr[805], lenToPass);
		case 805:
			consumer.onChar(804, arr[804], lenToPass);
		case 804:
			consumer.onChar(803, arr[803], lenToPass);
		case 803:
			consumer.onChar(802, arr[802], lenToPass);
		case 802:
			consumer.onChar(801, arr[801], lenToPass);
		case 801:
			consumer.onChar(800, arr[800], lenToPass);
		case 800:
			consumer.onChar(799, arr[799], lenToPass);
		case 799:
			consumer.onChar(798, arr[798], lenToPass);
		case 798:
			consumer.onChar(797, arr[797], lenToPass);
		case 797:
			consumer.onChar(796, arr[796], lenToPass);
		case 796:
			consumer.onChar(795, arr[795], lenToPass);
		case 795:
			consumer.onChar(794, arr[794], lenToPass);
		case 794:
			consumer.onChar(793, arr[793], lenToPass);
		case 793:
			consumer.onChar(792, arr[792], lenToPass);
		case 792:
			consumer.onChar(791, arr[791], lenToPass);
		case 791:
			consumer.onChar(790, arr[790], lenToPass);
		case 790:
			consumer.onChar(789, arr[789], lenToPass);
		case 789:
			consumer.onChar(788, arr[788], lenToPass);
		case 788:
			consumer.onChar(787, arr[787], lenToPass);
		case 787:
			consumer.onChar(786, arr[786], lenToPass);
		case 786:
			consumer.onChar(785, arr[785], lenToPass);
		case 785:
			consumer.onChar(784, arr[784], lenToPass);
		case 784:
			consumer.onChar(783, arr[783], lenToPass);
		case 783:
			consumer.onChar(782, arr[782], lenToPass);
		case 782:
			consumer.onChar(781, arr[781], lenToPass);
		case 781:
			consumer.onChar(780, arr[780], lenToPass);
		case 780:
			consumer.onChar(779, arr[779], lenToPass);
		case 779:
			consumer.onChar(778, arr[778], lenToPass);
		case 778:
			consumer.onChar(777, arr[777], lenToPass);
		case 777:
			consumer.onChar(776, arr[776], lenToPass);
		case 776:
			consumer.onChar(775, arr[775], lenToPass);
		case 775:
			consumer.onChar(774, arr[774], lenToPass);
		case 774:
			consumer.onChar(773, arr[773], lenToPass);
		case 773:
			consumer.onChar(772, arr[772], lenToPass);
		case 772:
			consumer.onChar(771, arr[771], lenToPass);
		case 771:
			consumer.onChar(770, arr[770], lenToPass);
		case 770:
			consumer.onChar(769, arr[769], lenToPass);
		case 769:
			consumer.onChar(768, arr[768], lenToPass);
		case 768:
			consumer.onChar(767, arr[767], lenToPass);
		case 767:
			consumer.onChar(766, arr[766], lenToPass);
		case 766:
			consumer.onChar(765, arr[765], lenToPass);
		case 765:
			consumer.onChar(764, arr[764], lenToPass);
		case 764:
			consumer.onChar(763, arr[763], lenToPass);
		case 763:
			consumer.onChar(762, arr[762], lenToPass);
		case 762:
			consumer.onChar(761, arr[761], lenToPass);
		case 761:
			consumer.onChar(760, arr[760], lenToPass);
		case 760:
			consumer.onChar(759, arr[759], lenToPass);
		case 759:
			consumer.onChar(758, arr[758], lenToPass);
		case 758:
			consumer.onChar(757, arr[757], lenToPass);
		case 757:
			consumer.onChar(756, arr[756], lenToPass);
		case 756:
			consumer.onChar(755, arr[755], lenToPass);
		case 755:
			consumer.onChar(754, arr[754], lenToPass);
		case 754:
			consumer.onChar(753, arr[753], lenToPass);
		case 753:
			consumer.onChar(752, arr[752], lenToPass);
		case 752:
			consumer.onChar(751, arr[751], lenToPass);
		case 751:
			consumer.onChar(750, arr[750], lenToPass);
		case 750:
			consumer.onChar(749, arr[749], lenToPass);
		case 749:
			consumer.onChar(748, arr[748], lenToPass);
		case 748:
			consumer.onChar(747, arr[747], lenToPass);
		case 747:
			consumer.onChar(746, arr[746], lenToPass);
		case 746:
			consumer.onChar(745, arr[745], lenToPass);
		case 745:
			consumer.onChar(744, arr[744], lenToPass);
		case 744:
			consumer.onChar(743, arr[743], lenToPass);
		case 743:
			consumer.onChar(742, arr[742], lenToPass);
		case 742:
			consumer.onChar(741, arr[741], lenToPass);
		case 741:
			consumer.onChar(740, arr[740], lenToPass);
		case 740:
			consumer.onChar(739, arr[739], lenToPass);
		case 739:
			consumer.onChar(738, arr[738], lenToPass);
		case 738:
			consumer.onChar(737, arr[737], lenToPass);
		case 737:
			consumer.onChar(736, arr[736], lenToPass);
		case 736:
			consumer.onChar(735, arr[735], lenToPass);
		case 735:
			consumer.onChar(734, arr[734], lenToPass);
		case 734:
			consumer.onChar(733, arr[733], lenToPass);
		case 733:
			consumer.onChar(732, arr[732], lenToPass);
		case 732:
			consumer.onChar(731, arr[731], lenToPass);
		case 731:
			consumer.onChar(730, arr[730], lenToPass);
		case 730:
			consumer.onChar(729, arr[729], lenToPass);
		case 729:
			consumer.onChar(728, arr[728], lenToPass);
		case 728:
			consumer.onChar(727, arr[727], lenToPass);
		case 727:
			consumer.onChar(726, arr[726], lenToPass);
		case 726:
			consumer.onChar(725, arr[725], lenToPass);
		case 725:
			consumer.onChar(724, arr[724], lenToPass);
		case 724:
			consumer.onChar(723, arr[723], lenToPass);
		case 723:
			consumer.onChar(722, arr[722], lenToPass);
		case 722:
			consumer.onChar(721, arr[721], lenToPass);
		case 721:
			consumer.onChar(720, arr[720], lenToPass);
		case 720:
			consumer.onChar(719, arr[719], lenToPass);
		case 719:
			consumer.onChar(718, arr[718], lenToPass);
		case 718:
			consumer.onChar(717, arr[717], lenToPass);
		case 717:
			consumer.onChar(716, arr[716], lenToPass);
		case 716:
			consumer.onChar(715, arr[715], lenToPass);
		case 715:
			consumer.onChar(714, arr[714], lenToPass);
		case 714:
			consumer.onChar(713, arr[713], lenToPass);
		case 713:
			consumer.onChar(712, arr[712], lenToPass);
		case 712:
			consumer.onChar(711, arr[711], lenToPass);
		case 711:
			consumer.onChar(710, arr[710], lenToPass);
		case 710:
			consumer.onChar(709, arr[709], lenToPass);
		case 709:
			consumer.onChar(708, arr[708], lenToPass);
		case 708:
			consumer.onChar(707, arr[707], lenToPass);
		case 707:
			consumer.onChar(706, arr[706], lenToPass);
		case 706:
			consumer.onChar(705, arr[705], lenToPass);
		case 705:
			consumer.onChar(704, arr[704], lenToPass);
		case 704:
			consumer.onChar(703, arr[703], lenToPass);
		case 703:
			consumer.onChar(702, arr[702], lenToPass);
		case 702:
			consumer.onChar(701, arr[701], lenToPass);
		case 701:
			consumer.onChar(700, arr[700], lenToPass);
		case 700:
			consumer.onChar(699, arr[699], lenToPass);
		case 699:
			consumer.onChar(698, arr[698], lenToPass);
		case 698:
			consumer.onChar(697, arr[697], lenToPass);
		case 697:
			consumer.onChar(696, arr[696], lenToPass);
		case 696:
			consumer.onChar(695, arr[695], lenToPass);
		case 695:
			consumer.onChar(694, arr[694], lenToPass);
		case 694:
			consumer.onChar(693, arr[693], lenToPass);
		case 693:
			consumer.onChar(692, arr[692], lenToPass);
		case 692:
			consumer.onChar(691, arr[691], lenToPass);
		case 691:
			consumer.onChar(690, arr[690], lenToPass);
		case 690:
			consumer.onChar(689, arr[689], lenToPass);
		case 689:
			consumer.onChar(688, arr[688], lenToPass);
		case 688:
			consumer.onChar(687, arr[687], lenToPass);
		case 687:
			consumer.onChar(686, arr[686], lenToPass);
		case 686:
			consumer.onChar(685, arr[685], lenToPass);
		case 685:
			consumer.onChar(684, arr[684], lenToPass);
		case 684:
			consumer.onChar(683, arr[683], lenToPass);
		case 683:
			consumer.onChar(682, arr[682], lenToPass);
		case 682:
			consumer.onChar(681, arr[681], lenToPass);
		case 681:
			consumer.onChar(680, arr[680], lenToPass);
		case 680:
			consumer.onChar(679, arr[679], lenToPass);
		case 679:
			consumer.onChar(678, arr[678], lenToPass);
		case 678:
			consumer.onChar(677, arr[677], lenToPass);
		case 677:
			consumer.onChar(676, arr[676], lenToPass);
		case 676:
			consumer.onChar(675, arr[675], lenToPass);
		case 675:
			consumer.onChar(674, arr[674], lenToPass);
		case 674:
			consumer.onChar(673, arr[673], lenToPass);
		case 673:
			consumer.onChar(672, arr[672], lenToPass);
		case 672:
			consumer.onChar(671, arr[671], lenToPass);
		case 671:
			consumer.onChar(670, arr[670], lenToPass);
		case 670:
			consumer.onChar(669, arr[669], lenToPass);
		case 669:
			consumer.onChar(668, arr[668], lenToPass);
		case 668:
			consumer.onChar(667, arr[667], lenToPass);
		case 667:
			consumer.onChar(666, arr[666], lenToPass);
		case 666:
			consumer.onChar(665, arr[665], lenToPass);
		case 665:
			consumer.onChar(664, arr[664], lenToPass);
		case 664:
			consumer.onChar(663, arr[663], lenToPass);
		case 663:
			consumer.onChar(662, arr[662], lenToPass);
		case 662:
			consumer.onChar(661, arr[661], lenToPass);
		case 661:
			consumer.onChar(660, arr[660], lenToPass);
		case 660:
			consumer.onChar(659, arr[659], lenToPass);
		case 659:
			consumer.onChar(658, arr[658], lenToPass);
		case 658:
			consumer.onChar(657, arr[657], lenToPass);
		case 657:
			consumer.onChar(656, arr[656], lenToPass);
		case 656:
			consumer.onChar(655, arr[655], lenToPass);
		case 655:
			consumer.onChar(654, arr[654], lenToPass);
		case 654:
			consumer.onChar(653, arr[653], lenToPass);
		case 653:
			consumer.onChar(652, arr[652], lenToPass);
		case 652:
			consumer.onChar(651, arr[651], lenToPass);
		case 651:
			consumer.onChar(650, arr[650], lenToPass);
		case 650:
			consumer.onChar(649, arr[649], lenToPass);
		case 649:
			consumer.onChar(648, arr[648], lenToPass);
		case 648:
			consumer.onChar(647, arr[647], lenToPass);
		case 647:
			consumer.onChar(646, arr[646], lenToPass);
		case 646:
			consumer.onChar(645, arr[645], lenToPass);
		case 645:
			consumer.onChar(644, arr[644], lenToPass);
		case 644:
			consumer.onChar(643, arr[643], lenToPass);
		case 643:
			consumer.onChar(642, arr[642], lenToPass);
		case 642:
			consumer.onChar(641, arr[641], lenToPass);
		case 641:
			consumer.onChar(640, arr[640], lenToPass);
		case 640:
			consumer.onChar(639, arr[639], lenToPass);
		case 639:
			consumer.onChar(638, arr[638], lenToPass);
		case 638:
			consumer.onChar(637, arr[637], lenToPass);
		case 637:
			consumer.onChar(636, arr[636], lenToPass);
		case 636:
			consumer.onChar(635, arr[635], lenToPass);
		case 635:
			consumer.onChar(634, arr[634], lenToPass);
		case 634:
			consumer.onChar(633, arr[633], lenToPass);
		case 633:
			consumer.onChar(632, arr[632], lenToPass);
		case 632:
			consumer.onChar(631, arr[631], lenToPass);
		case 631:
			consumer.onChar(630, arr[630], lenToPass);
		case 630:
			consumer.onChar(629, arr[629], lenToPass);
		case 629:
			consumer.onChar(628, arr[628], lenToPass);
		case 628:
			consumer.onChar(627, arr[627], lenToPass);
		case 627:
			consumer.onChar(626, arr[626], lenToPass);
		case 626:
			consumer.onChar(625, arr[625], lenToPass);
		case 625:
			consumer.onChar(624, arr[624], lenToPass);
		case 624:
			consumer.onChar(623, arr[623], lenToPass);
		case 623:
			consumer.onChar(622, arr[622], lenToPass);
		case 622:
			consumer.onChar(621, arr[621], lenToPass);
		case 621:
			consumer.onChar(620, arr[620], lenToPass);
		case 620:
			consumer.onChar(619, arr[619], lenToPass);
		case 619:
			consumer.onChar(618, arr[618], lenToPass);
		case 618:
			consumer.onChar(617, arr[617], lenToPass);
		case 617:
			consumer.onChar(616, arr[616], lenToPass);
		case 616:
			consumer.onChar(615, arr[615], lenToPass);
		case 615:
			consumer.onChar(614, arr[614], lenToPass);
		case 614:
			consumer.onChar(613, arr[613], lenToPass);
		case 613:
			consumer.onChar(612, arr[612], lenToPass);
		case 612:
			consumer.onChar(611, arr[611], lenToPass);
		case 611:
			consumer.onChar(610, arr[610], lenToPass);
		case 610:
			consumer.onChar(609, arr[609], lenToPass);
		case 609:
			consumer.onChar(608, arr[608], lenToPass);
		case 608:
			consumer.onChar(607, arr[607], lenToPass);
		case 607:
			consumer.onChar(606, arr[606], lenToPass);
		case 606:
			consumer.onChar(605, arr[605], lenToPass);
		case 605:
			consumer.onChar(604, arr[604], lenToPass);
		case 604:
			consumer.onChar(603, arr[603], lenToPass);
		case 603:
			consumer.onChar(602, arr[602], lenToPass);
		case 602:
			consumer.onChar(601, arr[601], lenToPass);
		case 601:
			consumer.onChar(600, arr[600], lenToPass);
		case 600:
			consumer.onChar(599, arr[599], lenToPass);
		case 599:
			consumer.onChar(598, arr[598], lenToPass);
		case 598:
			consumer.onChar(597, arr[597], lenToPass);
		case 597:
			consumer.onChar(596, arr[596], lenToPass);
		case 596:
			consumer.onChar(595, arr[595], lenToPass);
		case 595:
			consumer.onChar(594, arr[594], lenToPass);
		case 594:
			consumer.onChar(593, arr[593], lenToPass);
		case 593:
			consumer.onChar(592, arr[592], lenToPass);
		case 592:
			consumer.onChar(591, arr[591], lenToPass);
		case 591:
			consumer.onChar(590, arr[590], lenToPass);
		case 590:
			consumer.onChar(589, arr[589], lenToPass);
		case 589:
			consumer.onChar(588, arr[588], lenToPass);
		case 588:
			consumer.onChar(587, arr[587], lenToPass);
		case 587:
			consumer.onChar(586, arr[586], lenToPass);
		case 586:
			consumer.onChar(585, arr[585], lenToPass);
		case 585:
			consumer.onChar(584, arr[584], lenToPass);
		case 584:
			consumer.onChar(583, arr[583], lenToPass);
		case 583:
			consumer.onChar(582, arr[582], lenToPass);
		case 582:
			consumer.onChar(581, arr[581], lenToPass);
		case 581:
			consumer.onChar(580, arr[580], lenToPass);
		case 580:
			consumer.onChar(579, arr[579], lenToPass);
		case 579:
			consumer.onChar(578, arr[578], lenToPass);
		case 578:
			consumer.onChar(577, arr[577], lenToPass);
		case 577:
			consumer.onChar(576, arr[576], lenToPass);
		case 576:
			consumer.onChar(575, arr[575], lenToPass);
		case 575:
			consumer.onChar(574, arr[574], lenToPass);
		case 574:
			consumer.onChar(573, arr[573], lenToPass);
		case 573:
			consumer.onChar(572, arr[572], lenToPass);
		case 572:
			consumer.onChar(571, arr[571], lenToPass);
		case 571:
			consumer.onChar(570, arr[570], lenToPass);
		case 570:
			consumer.onChar(569, arr[569], lenToPass);
		case 569:
			consumer.onChar(568, arr[568], lenToPass);
		case 568:
			consumer.onChar(567, arr[567], lenToPass);
		case 567:
			consumer.onChar(566, arr[566], lenToPass);
		case 566:
			consumer.onChar(565, arr[565], lenToPass);
		case 565:
			consumer.onChar(564, arr[564], lenToPass);
		case 564:
			consumer.onChar(563, arr[563], lenToPass);
		case 563:
			consumer.onChar(562, arr[562], lenToPass);
		case 562:
			consumer.onChar(561, arr[561], lenToPass);
		case 561:
			consumer.onChar(560, arr[560], lenToPass);
		case 560:
			consumer.onChar(559, arr[559], lenToPass);
		case 559:
			consumer.onChar(558, arr[558], lenToPass);
		case 558:
			consumer.onChar(557, arr[557], lenToPass);
		case 557:
			consumer.onChar(556, arr[556], lenToPass);
		case 556:
			consumer.onChar(555, arr[555], lenToPass);
		case 555:
			consumer.onChar(554, arr[554], lenToPass);
		case 554:
			consumer.onChar(553, arr[553], lenToPass);
		case 553:
			consumer.onChar(552, arr[552], lenToPass);
		case 552:
			consumer.onChar(551, arr[551], lenToPass);
		case 551:
			consumer.onChar(550, arr[550], lenToPass);
		case 550:
			consumer.onChar(549, arr[549], lenToPass);
		case 549:
			consumer.onChar(548, arr[548], lenToPass);
		case 548:
			consumer.onChar(547, arr[547], lenToPass);
		case 547:
			consumer.onChar(546, arr[546], lenToPass);
		case 546:
			consumer.onChar(545, arr[545], lenToPass);
		case 545:
			consumer.onChar(544, arr[544], lenToPass);
		case 544:
			consumer.onChar(543, arr[543], lenToPass);
		case 543:
			consumer.onChar(542, arr[542], lenToPass);
		case 542:
			consumer.onChar(541, arr[541], lenToPass);
		case 541:
			consumer.onChar(540, arr[540], lenToPass);
		case 540:
			consumer.onChar(539, arr[539], lenToPass);
		case 539:
			consumer.onChar(538, arr[538], lenToPass);
		case 538:
			consumer.onChar(537, arr[537], lenToPass);
		case 537:
			consumer.onChar(536, arr[536], lenToPass);
		case 536:
			consumer.onChar(535, arr[535], lenToPass);
		case 535:
			consumer.onChar(534, arr[534], lenToPass);
		case 534:
			consumer.onChar(533, arr[533], lenToPass);
		case 533:
			consumer.onChar(532, arr[532], lenToPass);
		case 532:
			consumer.onChar(531, arr[531], lenToPass);
		case 531:
			consumer.onChar(530, arr[530], lenToPass);
		case 530:
			consumer.onChar(529, arr[529], lenToPass);
		case 529:
			consumer.onChar(528, arr[528], lenToPass);
		case 528:
			consumer.onChar(527, arr[527], lenToPass);
		case 527:
			consumer.onChar(526, arr[526], lenToPass);
		case 526:
			consumer.onChar(525, arr[525], lenToPass);
		case 525:
			consumer.onChar(524, arr[524], lenToPass);
		case 524:
			consumer.onChar(523, arr[523], lenToPass);
		case 523:
			consumer.onChar(522, arr[522], lenToPass);
		case 522:
			consumer.onChar(521, arr[521], lenToPass);
		case 521:
			consumer.onChar(520, arr[520], lenToPass);
		case 520:
			consumer.onChar(519, arr[519], lenToPass);
		case 519:
			consumer.onChar(518, arr[518], lenToPass);
		case 518:
			consumer.onChar(517, arr[517], lenToPass);
		case 517:
			consumer.onChar(516, arr[516], lenToPass);
		case 516:
			consumer.onChar(515, arr[515], lenToPass);
		case 515:
			consumer.onChar(514, arr[514], lenToPass);
		case 514:
			consumer.onChar(513, arr[513], lenToPass);
		case 513:
			consumer.onChar(512, arr[512], lenToPass);
		case 512:
			consumer.onChar(511, arr[511], lenToPass);
		case 511:
			consumer.onChar(510, arr[510], lenToPass);
		case 510:
			consumer.onChar(509, arr[509], lenToPass);
		case 509:
			consumer.onChar(508, arr[508], lenToPass);
		case 508:
			consumer.onChar(507, arr[507], lenToPass);
		case 507:
			consumer.onChar(506, arr[506], lenToPass);
		case 506:
			consumer.onChar(505, arr[505], lenToPass);
		case 505:
			consumer.onChar(504, arr[504], lenToPass);
		case 504:
			consumer.onChar(503, arr[503], lenToPass);
		case 503:
			consumer.onChar(502, arr[502], lenToPass);
		case 502:
			consumer.onChar(501, arr[501], lenToPass);
		case 501:
			consumer.onChar(500, arr[500], lenToPass);
		case 500:
			consumer.onChar(499, arr[499], lenToPass);
		case 499:
			consumer.onChar(498, arr[498], lenToPass);
		case 498:
			consumer.onChar(497, arr[497], lenToPass);
		case 497:
			consumer.onChar(496, arr[496], lenToPass);
		case 496:
			consumer.onChar(495, arr[495], lenToPass);
		case 495:
			consumer.onChar(494, arr[494], lenToPass);
		case 494:
			consumer.onChar(493, arr[493], lenToPass);
		case 493:
			consumer.onChar(492, arr[492], lenToPass);
		case 492:
			consumer.onChar(491, arr[491], lenToPass);
		case 491:
			consumer.onChar(490, arr[490], lenToPass);
		case 490:
			consumer.onChar(489, arr[489], lenToPass);
		case 489:
			consumer.onChar(488, arr[488], lenToPass);
		case 488:
			consumer.onChar(487, arr[487], lenToPass);
		case 487:
			consumer.onChar(486, arr[486], lenToPass);
		case 486:
			consumer.onChar(485, arr[485], lenToPass);
		case 485:
			consumer.onChar(484, arr[484], lenToPass);
		case 484:
			consumer.onChar(483, arr[483], lenToPass);
		case 483:
			consumer.onChar(482, arr[482], lenToPass);
		case 482:
			consumer.onChar(481, arr[481], lenToPass);
		case 481:
			consumer.onChar(480, arr[480], lenToPass);
		case 480:
			consumer.onChar(479, arr[479], lenToPass);
		case 479:
			consumer.onChar(478, arr[478], lenToPass);
		case 478:
			consumer.onChar(477, arr[477], lenToPass);
		case 477:
			consumer.onChar(476, arr[476], lenToPass);
		case 476:
			consumer.onChar(475, arr[475], lenToPass);
		case 475:
			consumer.onChar(474, arr[474], lenToPass);
		case 474:
			consumer.onChar(473, arr[473], lenToPass);
		case 473:
			consumer.onChar(472, arr[472], lenToPass);
		case 472:
			consumer.onChar(471, arr[471], lenToPass);
		case 471:
			consumer.onChar(470, arr[470], lenToPass);
		case 470:
			consumer.onChar(469, arr[469], lenToPass);
		case 469:
			consumer.onChar(468, arr[468], lenToPass);
		case 468:
			consumer.onChar(467, arr[467], lenToPass);
		case 467:
			consumer.onChar(466, arr[466], lenToPass);
		case 466:
			consumer.onChar(465, arr[465], lenToPass);
		case 465:
			consumer.onChar(464, arr[464], lenToPass);
		case 464:
			consumer.onChar(463, arr[463], lenToPass);
		case 463:
			consumer.onChar(462, arr[462], lenToPass);
		case 462:
			consumer.onChar(461, arr[461], lenToPass);
		case 461:
			consumer.onChar(460, arr[460], lenToPass);
		case 460:
			consumer.onChar(459, arr[459], lenToPass);
		case 459:
			consumer.onChar(458, arr[458], lenToPass);
		case 458:
			consumer.onChar(457, arr[457], lenToPass);
		case 457:
			consumer.onChar(456, arr[456], lenToPass);
		case 456:
			consumer.onChar(455, arr[455], lenToPass);
		case 455:
			consumer.onChar(454, arr[454], lenToPass);
		case 454:
			consumer.onChar(453, arr[453], lenToPass);
		case 453:
			consumer.onChar(452, arr[452], lenToPass);
		case 452:
			consumer.onChar(451, arr[451], lenToPass);
		case 451:
			consumer.onChar(450, arr[450], lenToPass);
		case 450:
			consumer.onChar(449, arr[449], lenToPass);
		case 449:
			consumer.onChar(448, arr[448], lenToPass);
		case 448:
			consumer.onChar(447, arr[447], lenToPass);
		case 447:
			consumer.onChar(446, arr[446], lenToPass);
		case 446:
			consumer.onChar(445, arr[445], lenToPass);
		case 445:
			consumer.onChar(444, arr[444], lenToPass);
		case 444:
			consumer.onChar(443, arr[443], lenToPass);
		case 443:
			consumer.onChar(442, arr[442], lenToPass);
		case 442:
			consumer.onChar(441, arr[441], lenToPass);
		case 441:
			consumer.onChar(440, arr[440], lenToPass);
		case 440:
			consumer.onChar(439, arr[439], lenToPass);
		case 439:
			consumer.onChar(438, arr[438], lenToPass);
		case 438:
			consumer.onChar(437, arr[437], lenToPass);
		case 437:
			consumer.onChar(436, arr[436], lenToPass);
		case 436:
			consumer.onChar(435, arr[435], lenToPass);
		case 435:
			consumer.onChar(434, arr[434], lenToPass);
		case 434:
			consumer.onChar(433, arr[433], lenToPass);
		case 433:
			consumer.onChar(432, arr[432], lenToPass);
		case 432:
			consumer.onChar(431, arr[431], lenToPass);
		case 431:
			consumer.onChar(430, arr[430], lenToPass);
		case 430:
			consumer.onChar(429, arr[429], lenToPass);
		case 429:
			consumer.onChar(428, arr[428], lenToPass);
		case 428:
			consumer.onChar(427, arr[427], lenToPass);
		case 427:
			consumer.onChar(426, arr[426], lenToPass);
		case 426:
			consumer.onChar(425, arr[425], lenToPass);
		case 425:
			consumer.onChar(424, arr[424], lenToPass);
		case 424:
			consumer.onChar(423, arr[423], lenToPass);
		case 423:
			consumer.onChar(422, arr[422], lenToPass);
		case 422:
			consumer.onChar(421, arr[421], lenToPass);
		case 421:
			consumer.onChar(420, arr[420], lenToPass);
		case 420:
			consumer.onChar(419, arr[419], lenToPass);
		case 419:
			consumer.onChar(418, arr[418], lenToPass);
		case 418:
			consumer.onChar(417, arr[417], lenToPass);
		case 417:
			consumer.onChar(416, arr[416], lenToPass);
		case 416:
			consumer.onChar(415, arr[415], lenToPass);
		case 415:
			consumer.onChar(414, arr[414], lenToPass);
		case 414:
			consumer.onChar(413, arr[413], lenToPass);
		case 413:
			consumer.onChar(412, arr[412], lenToPass);
		case 412:
			consumer.onChar(411, arr[411], lenToPass);
		case 411:
			consumer.onChar(410, arr[410], lenToPass);
		case 410:
			consumer.onChar(409, arr[409], lenToPass);
		case 409:
			consumer.onChar(408, arr[408], lenToPass);
		case 408:
			consumer.onChar(407, arr[407], lenToPass);
		case 407:
			consumer.onChar(406, arr[406], lenToPass);
		case 406:
			consumer.onChar(405, arr[405], lenToPass);
		case 405:
			consumer.onChar(404, arr[404], lenToPass);
		case 404:
			consumer.onChar(403, arr[403], lenToPass);
		case 403:
			consumer.onChar(402, arr[402], lenToPass);
		case 402:
			consumer.onChar(401, arr[401], lenToPass);
		case 401:
			consumer.onChar(400, arr[400], lenToPass);
		case 400:
			consumer.onChar(399, arr[399], lenToPass);
		case 399:
			consumer.onChar(398, arr[398], lenToPass);
		case 398:
			consumer.onChar(397, arr[397], lenToPass);
		case 397:
			consumer.onChar(396, arr[396], lenToPass);
		case 396:
			consumer.onChar(395, arr[395], lenToPass);
		case 395:
			consumer.onChar(394, arr[394], lenToPass);
		case 394:
			consumer.onChar(393, arr[393], lenToPass);
		case 393:
			consumer.onChar(392, arr[392], lenToPass);
		case 392:
			consumer.onChar(391, arr[391], lenToPass);
		case 391:
			consumer.onChar(390, arr[390], lenToPass);
		case 390:
			consumer.onChar(389, arr[389], lenToPass);
		case 389:
			consumer.onChar(388, arr[388], lenToPass);
		case 388:
			consumer.onChar(387, arr[387], lenToPass);
		case 387:
			consumer.onChar(386, arr[386], lenToPass);
		case 386:
			consumer.onChar(385, arr[385], lenToPass);
		case 385:
			consumer.onChar(384, arr[384], lenToPass);
		case 384:
			consumer.onChar(383, arr[383], lenToPass);
		case 383:
			consumer.onChar(382, arr[382], lenToPass);
		case 382:
			consumer.onChar(381, arr[381], lenToPass);
		case 381:
			consumer.onChar(380, arr[380], lenToPass);
		case 380:
			consumer.onChar(379, arr[379], lenToPass);
		case 379:
			consumer.onChar(378, arr[378], lenToPass);
		case 378:
			consumer.onChar(377, arr[377], lenToPass);
		case 377:
			consumer.onChar(376, arr[376], lenToPass);
		case 376:
			consumer.onChar(375, arr[375], lenToPass);
		case 375:
			consumer.onChar(374, arr[374], lenToPass);
		case 374:
			consumer.onChar(373, arr[373], lenToPass);
		case 373:
			consumer.onChar(372, arr[372], lenToPass);
		case 372:
			consumer.onChar(371, arr[371], lenToPass);
		case 371:
			consumer.onChar(370, arr[370], lenToPass);
		case 370:
			consumer.onChar(369, arr[369], lenToPass);
		case 369:
			consumer.onChar(368, arr[368], lenToPass);
		case 368:
			consumer.onChar(367, arr[367], lenToPass);
		case 367:
			consumer.onChar(366, arr[366], lenToPass);
		case 366:
			consumer.onChar(365, arr[365], lenToPass);
		case 365:
			consumer.onChar(364, arr[364], lenToPass);
		case 364:
			consumer.onChar(363, arr[363], lenToPass);
		case 363:
			consumer.onChar(362, arr[362], lenToPass);
		case 362:
			consumer.onChar(361, arr[361], lenToPass);
		case 361:
			consumer.onChar(360, arr[360], lenToPass);
		case 360:
			consumer.onChar(359, arr[359], lenToPass);
		case 359:
			consumer.onChar(358, arr[358], lenToPass);
		case 358:
			consumer.onChar(357, arr[357], lenToPass);
		case 357:
			consumer.onChar(356, arr[356], lenToPass);
		case 356:
			consumer.onChar(355, arr[355], lenToPass);
		case 355:
			consumer.onChar(354, arr[354], lenToPass);
		case 354:
			consumer.onChar(353, arr[353], lenToPass);
		case 353:
			consumer.onChar(352, arr[352], lenToPass);
		case 352:
			consumer.onChar(351, arr[351], lenToPass);
		case 351:
			consumer.onChar(350, arr[350], lenToPass);
		case 350:
			consumer.onChar(349, arr[349], lenToPass);
		case 349:
			consumer.onChar(348, arr[348], lenToPass);
		case 348:
			consumer.onChar(347, arr[347], lenToPass);
		case 347:
			consumer.onChar(346, arr[346], lenToPass);
		case 346:
			consumer.onChar(345, arr[345], lenToPass);
		case 345:
			consumer.onChar(344, arr[344], lenToPass);
		case 344:
			consumer.onChar(343, arr[343], lenToPass);
		case 343:
			consumer.onChar(342, arr[342], lenToPass);
		case 342:
			consumer.onChar(341, arr[341], lenToPass);
		case 341:
			consumer.onChar(340, arr[340], lenToPass);
		case 340:
			consumer.onChar(339, arr[339], lenToPass);
		case 339:
			consumer.onChar(338, arr[338], lenToPass);
		case 338:
			consumer.onChar(337, arr[337], lenToPass);
		case 337:
			consumer.onChar(336, arr[336], lenToPass);
		case 336:
			consumer.onChar(335, arr[335], lenToPass);
		case 335:
			consumer.onChar(334, arr[334], lenToPass);
		case 334:
			consumer.onChar(333, arr[333], lenToPass);
		case 333:
			consumer.onChar(332, arr[332], lenToPass);
		case 332:
			consumer.onChar(331, arr[331], lenToPass);
		case 331:
			consumer.onChar(330, arr[330], lenToPass);
		case 330:
			consumer.onChar(329, arr[329], lenToPass);
		case 329:
			consumer.onChar(328, arr[328], lenToPass);
		case 328:
			consumer.onChar(327, arr[327], lenToPass);
		case 327:
			consumer.onChar(326, arr[326], lenToPass);
		case 326:
			consumer.onChar(325, arr[325], lenToPass);
		case 325:
			consumer.onChar(324, arr[324], lenToPass);
		case 324:
			consumer.onChar(323, arr[323], lenToPass);
		case 323:
			consumer.onChar(322, arr[322], lenToPass);
		case 322:
			consumer.onChar(321, arr[321], lenToPass);
		case 321:
			consumer.onChar(320, arr[320], lenToPass);
		case 320:
			consumer.onChar(319, arr[319], lenToPass);
		case 319:
			consumer.onChar(318, arr[318], lenToPass);
		case 318:
			consumer.onChar(317, arr[317], lenToPass);
		case 317:
			consumer.onChar(316, arr[316], lenToPass);
		case 316:
			consumer.onChar(315, arr[315], lenToPass);
		case 315:
			consumer.onChar(314, arr[314], lenToPass);
		case 314:
			consumer.onChar(313, arr[313], lenToPass);
		case 313:
			consumer.onChar(312, arr[312], lenToPass);
		case 312:
			consumer.onChar(311, arr[311], lenToPass);
		case 311:
			consumer.onChar(310, arr[310], lenToPass);
		case 310:
			consumer.onChar(309, arr[309], lenToPass);
		case 309:
			consumer.onChar(308, arr[308], lenToPass);
		case 308:
			consumer.onChar(307, arr[307], lenToPass);
		case 307:
			consumer.onChar(306, arr[306], lenToPass);
		case 306:
			consumer.onChar(305, arr[305], lenToPass);
		case 305:
			consumer.onChar(304, arr[304], lenToPass);
		case 304:
			consumer.onChar(303, arr[303], lenToPass);
		case 303:
			consumer.onChar(302, arr[302], lenToPass);
		case 302:
			consumer.onChar(301, arr[301], lenToPass);
		case 301:
			consumer.onChar(300, arr[300], lenToPass);
		case 300:
			consumer.onChar(299, arr[299], lenToPass);
		case 299:
			consumer.onChar(298, arr[298], lenToPass);
		case 298:
			consumer.onChar(297, arr[297], lenToPass);
		case 297:
			consumer.onChar(296, arr[296], lenToPass);
		case 296:
			consumer.onChar(295, arr[295], lenToPass);
		case 295:
			consumer.onChar(294, arr[294], lenToPass);
		case 294:
			consumer.onChar(293, arr[293], lenToPass);
		case 293:
			consumer.onChar(292, arr[292], lenToPass);
		case 292:
			consumer.onChar(291, arr[291], lenToPass);
		case 291:
			consumer.onChar(290, arr[290], lenToPass);
		case 290:
			consumer.onChar(289, arr[289], lenToPass);
		case 289:
			consumer.onChar(288, arr[288], lenToPass);
		case 288:
			consumer.onChar(287, arr[287], lenToPass);
		case 287:
			consumer.onChar(286, arr[286], lenToPass);
		case 286:
			consumer.onChar(285, arr[285], lenToPass);
		case 285:
			consumer.onChar(284, arr[284], lenToPass);
		case 284:
			consumer.onChar(283, arr[283], lenToPass);
		case 283:
			consumer.onChar(282, arr[282], lenToPass);
		case 282:
			consumer.onChar(281, arr[281], lenToPass);
		case 281:
			consumer.onChar(280, arr[280], lenToPass);
		case 280:
			consumer.onChar(279, arr[279], lenToPass);
		case 279:
			consumer.onChar(278, arr[278], lenToPass);
		case 278:
			consumer.onChar(277, arr[277], lenToPass);
		case 277:
			consumer.onChar(276, arr[276], lenToPass);
		case 276:
			consumer.onChar(275, arr[275], lenToPass);
		case 275:
			consumer.onChar(274, arr[274], lenToPass);
		case 274:
			consumer.onChar(273, arr[273], lenToPass);
		case 273:
			consumer.onChar(272, arr[272], lenToPass);
		case 272:
			consumer.onChar(271, arr[271], lenToPass);
		case 271:
			consumer.onChar(270, arr[270], lenToPass);
		case 270:
			consumer.onChar(269, arr[269], lenToPass);
		case 269:
			consumer.onChar(268, arr[268], lenToPass);
		case 268:
			consumer.onChar(267, arr[267], lenToPass);
		case 267:
			consumer.onChar(266, arr[266], lenToPass);
		case 266:
			consumer.onChar(265, arr[265], lenToPass);
		case 265:
			consumer.onChar(264, arr[264], lenToPass);
		case 264:
			consumer.onChar(263, arr[263], lenToPass);
		case 263:
			consumer.onChar(262, arr[262], lenToPass);
		case 262:
			consumer.onChar(261, arr[261], lenToPass);
		case 261:
			consumer.onChar(260, arr[260], lenToPass);
		case 260:
			consumer.onChar(259, arr[259], lenToPass);
		case 259:
			consumer.onChar(258, arr[258], lenToPass);
		case 258:
			consumer.onChar(257, arr[257], lenToPass);
		case 257:
			consumer.onChar(256, arr[256], lenToPass);
		case 256:
			consumer.onChar(255, arr[255], lenToPass);
		case 255:
			consumer.onChar(254, arr[254], lenToPass);
		case 254:
			consumer.onChar(253, arr[253], lenToPass);
		case 253:
			consumer.onChar(252, arr[252], lenToPass);
		case 252:
			consumer.onChar(251, arr[251], lenToPass);
		case 251:
			consumer.onChar(250, arr[250], lenToPass);
		case 250:
			consumer.onChar(249, arr[249], lenToPass);
		case 249:
			consumer.onChar(248, arr[248], lenToPass);
		case 248:
			consumer.onChar(247, arr[247], lenToPass);
		case 247:
			consumer.onChar(246, arr[246], lenToPass);
		case 246:
			consumer.onChar(245, arr[245], lenToPass);
		case 245:
			consumer.onChar(244, arr[244], lenToPass);
		case 244:
			consumer.onChar(243, arr[243], lenToPass);
		case 243:
			consumer.onChar(242, arr[242], lenToPass);
		case 242:
			consumer.onChar(241, arr[241], lenToPass);
		case 241:
			consumer.onChar(240, arr[240], lenToPass);
		case 240:
			consumer.onChar(239, arr[239], lenToPass);
		case 239:
			consumer.onChar(238, arr[238], lenToPass);
		case 238:
			consumer.onChar(237, arr[237], lenToPass);
		case 237:
			consumer.onChar(236, arr[236], lenToPass);
		case 236:
			consumer.onChar(235, arr[235], lenToPass);
		case 235:
			consumer.onChar(234, arr[234], lenToPass);
		case 234:
			consumer.onChar(233, arr[233], lenToPass);
		case 233:
			consumer.onChar(232, arr[232], lenToPass);
		case 232:
			consumer.onChar(231, arr[231], lenToPass);
		case 231:
			consumer.onChar(230, arr[230], lenToPass);
		case 230:
			consumer.onChar(229, arr[229], lenToPass);
		case 229:
			consumer.onChar(228, arr[228], lenToPass);
		case 228:
			consumer.onChar(227, arr[227], lenToPass);
		case 227:
			consumer.onChar(226, arr[226], lenToPass);
		case 226:
			consumer.onChar(225, arr[225], lenToPass);
		case 225:
			consumer.onChar(224, arr[224], lenToPass);
		case 224:
			consumer.onChar(223, arr[223], lenToPass);
		case 223:
			consumer.onChar(222, arr[222], lenToPass);
		case 222:
			consumer.onChar(221, arr[221], lenToPass);
		case 221:
			consumer.onChar(220, arr[220], lenToPass);
		case 220:
			consumer.onChar(219, arr[219], lenToPass);
		case 219:
			consumer.onChar(218, arr[218], lenToPass);
		case 218:
			consumer.onChar(217, arr[217], lenToPass);
		case 217:
			consumer.onChar(216, arr[216], lenToPass);
		case 216:
			consumer.onChar(215, arr[215], lenToPass);
		case 215:
			consumer.onChar(214, arr[214], lenToPass);
		case 214:
			consumer.onChar(213, arr[213], lenToPass);
		case 213:
			consumer.onChar(212, arr[212], lenToPass);
		case 212:
			consumer.onChar(211, arr[211], lenToPass);
		case 211:
			consumer.onChar(210, arr[210], lenToPass);
		case 210:
			consumer.onChar(209, arr[209], lenToPass);
		case 209:
			consumer.onChar(208, arr[208], lenToPass);
		case 208:
			consumer.onChar(207, arr[207], lenToPass);
		case 207:
			consumer.onChar(206, arr[206], lenToPass);
		case 206:
			consumer.onChar(205, arr[205], lenToPass);
		case 205:
			consumer.onChar(204, arr[204], lenToPass);
		case 204:
			consumer.onChar(203, arr[203], lenToPass);
		case 203:
			consumer.onChar(202, arr[202], lenToPass);
		case 202:
			consumer.onChar(201, arr[201], lenToPass);
		case 201:
			consumer.onChar(200, arr[200], lenToPass);
		case 200:
			consumer.onChar(199, arr[199], lenToPass);
		case 199:
			consumer.onChar(198, arr[198], lenToPass);
		case 198:
			consumer.onChar(197, arr[197], lenToPass);
		case 197:
			consumer.onChar(196, arr[196], lenToPass);
		case 196:
			consumer.onChar(195, arr[195], lenToPass);
		case 195:
			consumer.onChar(194, arr[194], lenToPass);
		case 194:
			consumer.onChar(193, arr[193], lenToPass);
		case 193:
			consumer.onChar(192, arr[192], lenToPass);
		case 192:
			consumer.onChar(191, arr[191], lenToPass);
		case 191:
			consumer.onChar(190, arr[190], lenToPass);
		case 190:
			consumer.onChar(189, arr[189], lenToPass);
		case 189:
			consumer.onChar(188, arr[188], lenToPass);
		case 188:
			consumer.onChar(187, arr[187], lenToPass);
		case 187:
			consumer.onChar(186, arr[186], lenToPass);
		case 186:
			consumer.onChar(185, arr[185], lenToPass);
		case 185:
			consumer.onChar(184, arr[184], lenToPass);
		case 184:
			consumer.onChar(183, arr[183], lenToPass);
		case 183:
			consumer.onChar(182, arr[182], lenToPass);
		case 182:
			consumer.onChar(181, arr[181], lenToPass);
		case 181:
			consumer.onChar(180, arr[180], lenToPass);
		case 180:
			consumer.onChar(179, arr[179], lenToPass);
		case 179:
			consumer.onChar(178, arr[178], lenToPass);
		case 178:
			consumer.onChar(177, arr[177], lenToPass);
		case 177:
			consumer.onChar(176, arr[176], lenToPass);
		case 176:
			consumer.onChar(175, arr[175], lenToPass);
		case 175:
			consumer.onChar(174, arr[174], lenToPass);
		case 174:
			consumer.onChar(173, arr[173], lenToPass);
		case 173:
			consumer.onChar(172, arr[172], lenToPass);
		case 172:
			consumer.onChar(171, arr[171], lenToPass);
		case 171:
			consumer.onChar(170, arr[170], lenToPass);
		case 170:
			consumer.onChar(169, arr[169], lenToPass);
		case 169:
			consumer.onChar(168, arr[168], lenToPass);
		case 168:
			consumer.onChar(167, arr[167], lenToPass);
		case 167:
			consumer.onChar(166, arr[166], lenToPass);
		case 166:
			consumer.onChar(165, arr[165], lenToPass);
		case 165:
			consumer.onChar(164, arr[164], lenToPass);
		case 164:
			consumer.onChar(163, arr[163], lenToPass);
		case 163:
			consumer.onChar(162, arr[162], lenToPass);
		case 162:
			consumer.onChar(161, arr[161], lenToPass);
		case 161:
			consumer.onChar(160, arr[160], lenToPass);
		case 160:
			consumer.onChar(159, arr[159], lenToPass);
		case 159:
			consumer.onChar(158, arr[158], lenToPass);
		case 158:
			consumer.onChar(157, arr[157], lenToPass);
		case 157:
			consumer.onChar(156, arr[156], lenToPass);
		case 156:
			consumer.onChar(155, arr[155], lenToPass);
		case 155:
			consumer.onChar(154, arr[154], lenToPass);
		case 154:
			consumer.onChar(153, arr[153], lenToPass);
		case 153:
			consumer.onChar(152, arr[152], lenToPass);
		case 152:
			consumer.onChar(151, arr[151], lenToPass);
		case 151:
			consumer.onChar(150, arr[150], lenToPass);
		case 150:
			consumer.onChar(149, arr[149], lenToPass);
		case 149:
			consumer.onChar(148, arr[148], lenToPass);
		case 148:
			consumer.onChar(147, arr[147], lenToPass);
		case 147:
			consumer.onChar(146, arr[146], lenToPass);
		case 146:
			consumer.onChar(145, arr[145], lenToPass);
		case 145:
			consumer.onChar(144, arr[144], lenToPass);
		case 144:
			consumer.onChar(143, arr[143], lenToPass);
		case 143:
			consumer.onChar(142, arr[142], lenToPass);
		case 142:
			consumer.onChar(141, arr[141], lenToPass);
		case 141:
			consumer.onChar(140, arr[140], lenToPass);
		case 140:
			consumer.onChar(139, arr[139], lenToPass);
		case 139:
			consumer.onChar(138, arr[138], lenToPass);
		case 138:
			consumer.onChar(137, arr[137], lenToPass);
		case 137:
			consumer.onChar(136, arr[136], lenToPass);
		case 136:
			consumer.onChar(135, arr[135], lenToPass);
		case 135:
			consumer.onChar(134, arr[134], lenToPass);
		case 134:
			consumer.onChar(133, arr[133], lenToPass);
		case 133:
			consumer.onChar(132, arr[132], lenToPass);
		case 132:
			consumer.onChar(131, arr[131], lenToPass);
		case 131:
			consumer.onChar(130, arr[130], lenToPass);
		case 130:
			consumer.onChar(129, arr[129], lenToPass);
		case 129:
			consumer.onChar(128, arr[128], lenToPass);
		case 128:
			consumer.onChar(127, arr[127], lenToPass);
		case 127:
			consumer.onChar(126, arr[126], lenToPass);
		case 126:
			consumer.onChar(125, arr[125], lenToPass);
		case 125:
			consumer.onChar(124, arr[124], lenToPass);
		case 124:
			consumer.onChar(123, arr[123], lenToPass);
		case 123:
			consumer.onChar(122, arr[122], lenToPass);
		case 122:
			consumer.onChar(121, arr[121], lenToPass);
		case 121:
			consumer.onChar(120, arr[120], lenToPass);
		case 120:
			consumer.onChar(119, arr[119], lenToPass);
		case 119:
			consumer.onChar(118, arr[118], lenToPass);
		case 118:
			consumer.onChar(117, arr[117], lenToPass);
		case 117:
			consumer.onChar(116, arr[116], lenToPass);
		case 116:
			consumer.onChar(115, arr[115], lenToPass);
		case 115:
			consumer.onChar(114, arr[114], lenToPass);
		case 114:
			consumer.onChar(113, arr[113], lenToPass);
		case 113:
			consumer.onChar(112, arr[112], lenToPass);
		case 112:
			consumer.onChar(111, arr[111], lenToPass);
		case 111:
			consumer.onChar(110, arr[110], lenToPass);
		case 110:
			consumer.onChar(109, arr[109], lenToPass);
		case 109:
			consumer.onChar(108, arr[108], lenToPass);
		case 108:
			consumer.onChar(107, arr[107], lenToPass);
		case 107:
			consumer.onChar(106, arr[106], lenToPass);
		case 106:
			consumer.onChar(105, arr[105], lenToPass);
		case 105:
			consumer.onChar(104, arr[104], lenToPass);
		case 104:
			consumer.onChar(103, arr[103], lenToPass);
		case 103:
			consumer.onChar(102, arr[102], lenToPass);
		case 102:
			consumer.onChar(101, arr[101], lenToPass);
		case 101:
			consumer.onChar(100, arr[100], lenToPass);
		case 100:
			consumer.onChar(99, arr[99], lenToPass);
		case 99:
			consumer.onChar(98, arr[98], lenToPass);
		case 98:
			consumer.onChar(97, arr[97], lenToPass);
		case 97:
			consumer.onChar(96, arr[96], lenToPass);
		case 96:
			consumer.onChar(95, arr[95], lenToPass);
		case 95:
			consumer.onChar(94, arr[94], lenToPass);
		case 94:
			consumer.onChar(93, arr[93], lenToPass);
		case 93:
			consumer.onChar(92, arr[92], lenToPass);
		case 92:
			consumer.onChar(91, arr[91], lenToPass);
		case 91:
			consumer.onChar(90, arr[90], lenToPass);
		case 90:
			consumer.onChar(89, arr[89], lenToPass);
		case 89:
			consumer.onChar(88, arr[88], lenToPass);
		case 88:
			consumer.onChar(87, arr[87], lenToPass);
		case 87:
			consumer.onChar(86, arr[86], lenToPass);
		case 86:
			consumer.onChar(85, arr[85], lenToPass);
		case 85:
			consumer.onChar(84, arr[84], lenToPass);
		case 84:
			consumer.onChar(83, arr[83], lenToPass);
		case 83:
			consumer.onChar(82, arr[82], lenToPass);
		case 82:
			consumer.onChar(81, arr[81], lenToPass);
		case 81:
			consumer.onChar(80, arr[80], lenToPass);
		case 80:
			consumer.onChar(79, arr[79], lenToPass);
		case 79:
			consumer.onChar(78, arr[78], lenToPass);
		case 78:
			consumer.onChar(77, arr[77], lenToPass);
		case 77:
			consumer.onChar(76, arr[76], lenToPass);
		case 76:
			consumer.onChar(75, arr[75], lenToPass);
		case 75:
			consumer.onChar(74, arr[74], lenToPass);
		case 74:
			consumer.onChar(73, arr[73], lenToPass);
		case 73:
			consumer.onChar(72, arr[72], lenToPass);
		case 72:
			consumer.onChar(71, arr[71], lenToPass);
		case 71:
			consumer.onChar(70, arr[70], lenToPass);
		case 70:
			consumer.onChar(69, arr[69], lenToPass);
		case 69:
			consumer.onChar(68, arr[68], lenToPass);
		case 68:
			consumer.onChar(67, arr[67], lenToPass);
		case 67:
			consumer.onChar(66, arr[66], lenToPass);
		case 66:
			consumer.onChar(65, arr[65], lenToPass);
		case 65:
			consumer.onChar(64, arr[64], lenToPass);
		case 64:
			consumer.onChar(63, arr[63], lenToPass);
		case 63:
			consumer.onChar(62, arr[62], lenToPass);
		case 62:
			consumer.onChar(61, arr[61], lenToPass);
		case 61:
			consumer.onChar(60, arr[60], lenToPass);
		case 60:
			consumer.onChar(59, arr[59], lenToPass);
		case 59:
			consumer.onChar(58, arr[58], lenToPass);
		case 58:
			consumer.onChar(57, arr[57], lenToPass);
		case 57:
			consumer.onChar(56, arr[56], lenToPass);
		case 56:
			consumer.onChar(55, arr[55], lenToPass);
		case 55:
			consumer.onChar(54, arr[54], lenToPass);
		case 54:
			consumer.onChar(53, arr[53], lenToPass);
		case 53:
			consumer.onChar(52, arr[52], lenToPass);
		case 52:
			consumer.onChar(51, arr[51], lenToPass);
		case 51:
			consumer.onChar(50, arr[50], lenToPass);
		case 50:
			consumer.onChar(49, arr[49], lenToPass);
		case 49:
			consumer.onChar(48, arr[48], lenToPass);
		case 48:
			consumer.onChar(47, arr[47], lenToPass);
		case 47:
			consumer.onChar(46, arr[46], lenToPass);
		case 46:
			consumer.onChar(45, arr[45], lenToPass);
		case 45:
			consumer.onChar(44, arr[44], lenToPass);
		case 44:
			consumer.onChar(43, arr[43], lenToPass);
		case 43:
			consumer.onChar(42, arr[42], lenToPass);
		case 42:
			consumer.onChar(41, arr[41], lenToPass);
		case 41:
			consumer.onChar(40, arr[40], lenToPass);
		case 40:
			consumer.onChar(39, arr[39], lenToPass);
		case 39:
			consumer.onChar(38, arr[38], lenToPass);
		case 38:
			consumer.onChar(37, arr[37], lenToPass);
		case 37:
			consumer.onChar(36, arr[36], lenToPass);
		case 36:
			consumer.onChar(35, arr[35], lenToPass);
		case 35:
			consumer.onChar(34, arr[34], lenToPass);
		case 34:
			consumer.onChar(33, arr[33], lenToPass);
		case 33:
			consumer.onChar(32, arr[32], lenToPass);
		case 32:
			consumer.onChar(31, arr[31], lenToPass);
		case 31:
			consumer.onChar(30, arr[30], lenToPass);
		case 30:
			consumer.onChar(29, arr[29], lenToPass);
		case 29:
			consumer.onChar(28, arr[28], lenToPass);
		case 28:
			consumer.onChar(27, arr[27], lenToPass);
		case 27:
			consumer.onChar(26, arr[26], lenToPass);
		case 26:
			consumer.onChar(25, arr[25], lenToPass);
		case 25:
			consumer.onChar(24, arr[24], lenToPass);
		case 24:
			consumer.onChar(23, arr[23], lenToPass);
		case 23:
			consumer.onChar(22, arr[22], lenToPass);
		case 22:
			consumer.onChar(21, arr[21], lenToPass);
		case 21:
			consumer.onChar(20, arr[20], lenToPass);
		case 20:
			consumer.onChar(19, arr[19], lenToPass);
		case 19:
			consumer.onChar(18, arr[18], lenToPass);
		case 18:
			consumer.onChar(17, arr[17], lenToPass);
		case 17:
			consumer.onChar(16, arr[16], lenToPass);
		case 16:
			consumer.onChar(15, arr[15], lenToPass);
		case 15:
			consumer.onChar(14, arr[14], lenToPass);
		case 14:
			consumer.onChar(13, arr[13], lenToPass);
		case 13:
			consumer.onChar(12, arr[12], lenToPass);
		case 12:
			consumer.onChar(11, arr[11], lenToPass);
		case 11:
			consumer.onChar(10, arr[10], lenToPass);
		case 10:
			consumer.onChar(9, arr[9], lenToPass);
		case 9:
			consumer.onChar(8, arr[8], lenToPass);
		case 8:
			consumer.onChar(7, arr[7], lenToPass);
		case 7:
			consumer.onChar(6, arr[6], lenToPass);
		case 6:
			consumer.onChar(5, arr[5], lenToPass);
		case 5:
			consumer.onChar(4, arr[4], lenToPass);
		case 4:
			consumer.onChar(3, arr[3], lenToPass);
		case 3:
			consumer.onChar(2, arr[2], lenToPass);
		case 2:
			consumer.onChar(1, arr[1], lenToPass);
		case 1:
			consumer.onChar(0, arr[0], lenToPass);
			break;
		default:
			internalIterate(arr, maxLen, len, consumer);
			for (int i = maxLen; i < len; i++)
				consumer.onChar(i, arr[i], len);
			break;
		}
	}
}
