/*
 * Copyright (C) 2024 CrowdWare
 *
 * This file is part of FreeBookDesigner.
 *
 *  FreeBookDesigner is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  FreeBookDesigner is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeBookDesigner.  If not, see <http://www.gnu.org/licenses/>.
 */

package at.crowdware.freebookdesigner.ui
/*
// build.gradle-kts
implementation("com.google.accompanist:accompanist-pager:0.28.0")

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun EbookPager(pages: List<String>) {
    val pagerState = rememberPagerState()

    HorizontalPager(
        count = pages.size, // Total number of pages in the eBook
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        // Display each page content here
        Text(
            text = pages[page],  // Display text from the eBook pages list
            modifier = Modifier.fillMaxSize()
        )
    }
}

// lazy loading
@Composable
fun EbookReaderScreen() {
    val ebookPages = listOf(
        "Page 1: Introduction...",
        "Page 2: Chapter 1...",
        "Page 3: Chapter 2...",
        // Add more pages here
    )
    EbookPager(pages = ebookPages)
}
*/
